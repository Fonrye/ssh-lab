package com.fon.dao;

import com.fon.entity.EquipmentEntity;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 12:04
 *
 **/
public interface EquipDao {
//    在表中添加设备信息
    void equip(EquipmentEntity equipmentEntity);
//    查询表中内容
    List<EquipmentEntity> equipNum();

    EquipmentEntity findByPrimaryKey(String equipment);
}
