package com.fon.action;

import com.fon.entity.ApplyEntity;
import com.fon.service.ApplyService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 10:24
 **/
@Controller
public class ApplyAction extends ActionSupport implements ModelDriven {

    private ApplyEntity applyEntity;
    @Autowired
    private ApplyService applyService;

    public String save(){
        applyService.apply(applyEntity);
        return SUCCESS;
    }


    @Override
    public Object getModel() {
        if (applyEntity == null) {
            applyEntity = new ApplyEntity();
        }
        return applyEntity;
    }

    public ApplyEntity getApplyEntity() {
        return applyEntity;
    }

    public void setApplyEntity(ApplyEntity applyEntity) {
        this.applyEntity = applyEntity;
    }
}
