package com.fon.service;

import com.fon.entity.EquipmentEntity;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 12:04
 **/
public interface EquipService {
    void equip(EquipmentEntity equipmentEntity);
    List<EquipmentEntity> equipNum();
    EquipmentEntity getByKey(String equipment);
}
