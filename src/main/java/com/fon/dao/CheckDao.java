package com.fon.dao;

import com.fon.entity.ApplyEntity;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/29 10:41
 **/
public interface CheckDao {
    /*查询报修信息*/
    List<ApplyEntity> checkNum();

    /*填写报修原因*/
    void edit(ApplyEntity applyEntity);

    /**
     * 根据主键获取信息
     *
     * @param applyId
     * @return
     */
    ApplyEntity findByPrimaryKey(String applyId);
}
