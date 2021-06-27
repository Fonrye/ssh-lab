package com.fon.action;

import com.fon.entity.LabEntity;
import com.fon.service.LabService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/27 13:56
 **/
@Controller
public class LabAction extends ActionSupport implements ModelDriven {

    /*实验室编辑参数*/
    private LabEntity laboratory;
    @Autowired
    private LabService labService;

    /**
     * 新增保存/修改保存
     **/
    public String save() {
        labService.manage(laboratory);
        return SUCCESS;
    }

    /*查询实验室信息*/
    public String list() {
        List<LabEntity> list = labService.labNum();
        if (CollectionUtils.isEmpty(list)) {
            list = Collections.emptyList();
        }
        ServletActionContext.getRequest().setAttribute("labList", list);
        return "labList";
    }

    @Override

    public Object getModel() {
        if (laboratory == null) {
            laboratory = new LabEntity();
        }
        return laboratory;

    }

    public LabEntity getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(LabEntity laboratory) {
        this.laboratory = laboratory;
    }

}
