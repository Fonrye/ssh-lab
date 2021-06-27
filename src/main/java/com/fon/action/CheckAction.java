package com.fon.action;

import com.fon.entity.ApplyEntity;
import com.fon.service.CheckService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/29 10:41
 **/
@Controller
public class CheckAction extends ActionSupport implements ModelDriven {
    private ApplyEntity applyEntity;
    @Autowired
    private CheckService checkService;

    public String edit() throws UnsupportedEncodingException {
        ApplyEntity dbRecord = checkService.getByApplyId(applyEntity.getApplyId());
        if (dbRecord == null) {// 数据库无此记录
            ServletActionContext.getRequest().setAttribute("msg", "数据库无此记录！");
            return toCheckEdit();
        }
        // 报修原因不为空则更新记录
        if (!StringUtils.isEmpty(applyEntity.getReason())) {
            String reason = new String(applyEntity.getReason().getBytes("ISO-8859-1"), "UTF-8");
            dbRecord.setReason(applyEntity.getReason());
            checkService.edit(dbRecord);
        }
        return "editSuccess";
    }

    public String toCheckEdit() {
        ServletActionContext.getRequest().setAttribute("reason", applyEntity.getReason());
        ServletActionContext.getRequest().setAttribute("applyId", applyEntity.getApplyId());
        return "toCheckEdit";
    }

    public String list() {
        List<ApplyEntity> list = checkService.checkNum();
        if (CollectionUtils.isEmpty(list)) {
            list = Collections.emptyList();
        }
        ServletActionContext.getRequest().setAttribute("checkList", list);
        return SUCCESS;
    }


    @Override
    public Object getModel() {
        if (applyEntity == null) {
            applyEntity = new ApplyEntity();
        }
        return applyEntity;
    }
}
