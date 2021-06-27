package com.fon.service.impl;

import com.fon.dao.LabDao;
import com.fon.entity.LabEntity;
import com.fon.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/27 13:57
 **/
@Service
public class LabServiceImpl implements LabService {

    @Autowired
    private LabDao labDao;

    @Transactional
    @Override
    public void manage(LabEntity labEntity) {
        labDao.manage(labEntity);
    }

    @Override
    public List<LabEntity> labNum() {
        return labDao.labNum();
    }
}
