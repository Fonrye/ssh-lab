package com.fon.dao.impl;

import com.fon.dao.AccountDao;
import com.fon.entity.AccountEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public AccountEntity findByAccount(String username) {
        return getHibernateTemplate().execute(new HibernateCallback<AccountEntity>() {
            @Override
            public AccountEntity doInHibernate(Session session) throws HibernateException {

                String hql = "from AccountEntity where username=?";
                Query query = session.createQuery(hql);
                query.setParameter(0, username);
                // 账号是唯一的，所以只会返回一条记录
                return  (AccountEntity)query.uniqueResult();
            }
        });
    }

}
