package com.fon.service;

import com.fon.entity.EquipmentEntity;
import com.fon.entity.LabEntity;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/27 13:58
 **/
public interface LabService {
    void manage(LabEntity labEntity);
    List<LabEntity> labNum();
}
