package com.fon.dao.impl;

import com.fon.dao.CheckDao;
import com.fon.entity.ApplyEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/29 10:41
 **/
@Repository
public class CheckDaoImpl extends HibernateDaoSupport implements CheckDao {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    //查询报修信息
    @Override
    public List<ApplyEntity> checkNum() {
        return getHibernateTemplate().execute(
                new HibernateCallback<List<ApplyEntity>>() {
                    @Override
                    public List<ApplyEntity> doInHibernate(Session session) throws HibernateException {
                        String hql = "from ApplyEntity where 1=1";
                        Query query = session.createQuery(hql);
                        return query.list();
                    }
                }
        );
    }

    @Override
    public void edit(ApplyEntity applyEntity) {
        getHibernateTemplate().saveOrUpdate(applyEntity);
    }

    @Override
    public ApplyEntity findByPrimaryKey(String applyId) {
        return getHibernateTemplate().execute(
                new HibernateCallback<ApplyEntity>() {
                    @Override
                    public ApplyEntity doInHibernate(Session session) throws HibernateException {
                        String hql = "from ApplyEntity where applyId=?";
                        Query query = session.createQuery(hql);
                        query.setParameter(0, applyId);
                        return (ApplyEntity) query.uniqueResult();
                    }
                }
        );
    }
}
