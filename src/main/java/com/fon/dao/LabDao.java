package com.fon.dao;

import com.fon.entity.LabEntity;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/27 13:56
 **/
public interface LabDao {
    void manage(LabEntity labEntity);
//    查询实验室信息
    List<LabEntity> labNum();
}
