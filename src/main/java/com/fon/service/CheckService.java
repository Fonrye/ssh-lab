package com.fon.service;

import com.fon.entity.ApplyEntity;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/29 10:42
 **/
public interface CheckService {
    List<ApplyEntity> checkNum();

    void edit(ApplyEntity applyEntity);

    ApplyEntity getByApplyId(String applyId);
}
