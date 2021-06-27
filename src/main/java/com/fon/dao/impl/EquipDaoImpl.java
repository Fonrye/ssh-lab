package com.fon.dao.impl;

import com.fon.dao.EquipDao;
import com.fon.entity.EquipmentEntity;
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
 * @date 2020/5/28 12:04
 **/
@Repository
public class EquipDaoImpl extends HibernateDaoSupport implements EquipDao {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }


    @Override
    public void equip(EquipmentEntity equipmentEntity) {
        getHibernateTemplate().saveOrUpdate(equipmentEntity);
    }

    //查找数据库中的设备信息
    @Override
    public List<EquipmentEntity> equipNum() {
        return getHibernateTemplate().execute(
                new HibernateCallback<List<EquipmentEntity>>() {
                    @Override
                    public List<EquipmentEntity> doInHibernate(Session session) throws HibernateException {
                        String hql = "from EquipmentEntity where 1 = 1 ";
                        Query query = session.createQuery(hql);
                        List<EquipmentEntity> list = query.list();
                        return list;
                    }
                }

        );
    }

    @Override
    public EquipmentEntity findByPrimaryKey(String equipment) {
        return getHibernateTemplate().execute(
                new HibernateCallback<EquipmentEntity>() {
                    @Override
                    public EquipmentEntity doInHibernate(Session session) throws HibernateException {
                        String hql = "from EquipmentEntity where equipment = ?";
                        Query query = session.createQuery(hql);
                        query.setParameter(0, equipment);
                        return (EquipmentEntity) query.uniqueResult();
                    }
                }

        );
    }
}
