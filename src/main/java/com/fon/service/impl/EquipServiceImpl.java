package com.fon.service.impl;

import com.fon.dao.EquipDao;
import com.fon.entity.EquipmentEntity;
import com.fon.service.EquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 12:05
 **/
@Service
public class EquipServiceImpl implements EquipService {
    @Autowired
    private EquipDao equipDao;

    @Transactional
    @Override
    public void equip(EquipmentEntity equipmentEntity) {
        equipDao.equip(equipmentEntity);
    }

    @Override
    public List<EquipmentEntity> equipNum() {
        return equipDao.equipNum();
    }

    @Override
    public EquipmentEntity getByKey(String equipment) {
        if(StringUtils.isEmpty(equipment)){
            return null;
        }
        return equipDao.findByPrimaryKey(equipment);
    }
}
