package com.fon.dao.impl;

import com.fon.dao.LabDao;
import com.fon.entity.LabEntity;
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
 * @date 2020/5/27 13:56
 **/
@Repository
public class LabDaoImpl extends HibernateDaoSupport implements LabDao {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public void manage(LabEntity labEntity) {
        getHibernateTemplate().saveOrUpdate(labEntity);
    }

    @Override
    public List<LabEntity> labNum() {
        return getHibernateTemplate().execute(
                new HibernateCallback<List<LabEntity>>() {
                    @Override
                    public List<LabEntity> doInHibernate(Session session) throws HibernateException {
                        String hql = "from LabEntity where 1=1";
                        Query query = session.createQuery(hql);
                        List<LabEntity> list = query.list();
                        return list;
                    }
                }

        );
    }
}
