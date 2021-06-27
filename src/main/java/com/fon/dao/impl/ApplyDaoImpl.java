package com.fon.dao.impl;

import com.fon.dao.ApplyDao;
import com.fon.entity.ApplyEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 10:18
 **/
@Repository
public class ApplyDaoImpl extends HibernateDaoSupport implements ApplyDao {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    @Override
    public void apply(ApplyEntity applyEntity) {
        getHibernateTemplate().saveOrUpdate(applyEntity);
    }
}
