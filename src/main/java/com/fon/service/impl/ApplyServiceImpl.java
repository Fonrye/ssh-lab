package com.fon.service.impl;

import com.fon.dao.ApplyDao;
import com.fon.entity.ApplyEntity;
import com.fon.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 10:25
 **/
@Service
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    private ApplyDao applyDao;

    @Transactional
    @Override
    public void apply(ApplyEntity applyEntity) {
        applyDao.apply(applyEntity);
    }
}
