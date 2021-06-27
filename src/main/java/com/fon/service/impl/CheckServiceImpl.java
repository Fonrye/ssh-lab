package com.fon.service.impl;

import com.fon.dao.CheckDao;
import com.fon.entity.ApplyEntity;
import com.fon.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/29 10:42
 **/
@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckDao checkDao;

    @Override
    public List<ApplyEntity> checkNum() {
        return checkDao.checkNum();
    }

    @Transactional
    @Override
    public void edit(ApplyEntity applyEntity) {
        checkDao.edit(applyEntity);
    }

    @Override
    public ApplyEntity getByApplyId(String applyId) {
        if(StringUtils.isEmpty(applyId)){
            return null;
        }
        return checkDao.findByPrimaryKey(applyId);
    }
}
