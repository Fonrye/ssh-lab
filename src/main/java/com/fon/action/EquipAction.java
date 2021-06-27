package com.fon.action;

import com.fon.entity.EquipmentEntity;
import com.fon.service.EquipService;
import com.fon.util.QRCodeUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 12:03
 **/
@Controller
public class EquipAction extends ActionSupport implements ModelDriven {
    private EquipmentEntity equipmentEntity;
    @Autowired
    private EquipService equipService;
    private String codeContent;

    public String save() {
        equipService.equip(equipmentEntity);
        return SUCCESS;
    }

    public String list() {
        List<EquipmentEntity> list = equipService.equipNum();
        if (CollectionUtils.isEmpty(list)) {
            list = Collections.emptyList();
        }
        ServletActionContext.getRequest().setAttribute("equipList", list);
        return "equipList";
    }

    /*二维码数据显示详情*/
    public void detail() {
        PrintWriter pw = null;
        try {
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html; charset=utf-8");
            pw = response.getWriter();
            EquipmentEntity equipmentEntity = equipService.getByKey(codeContent);
            if (equipmentEntity == null) {
                pw.write("详情信息为空！");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("设备名称：").append(equipmentEntity.getEquipName()).append(";");
            sb.append("设备类型：").append(equipmentEntity.getEquipType()).append(";");
            sb.append("厂商：").append(equipmentEntity.getEquipFactory()).append(";");
            pw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    /*由id生成二维码*/
    public void qrCode() throws Exception {
        if (StringUtils.isEmpty(codeContent)) {
            return;
        }
        HttpServletResponse response = ServletActionContext.getResponse();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        QRCodeUtils.encode(codeContent, outputStream);
        outputStream.toByteArray();
        response.setContentType("image/*"); // 设置返回的文件类型
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Content-Disposition", "attachment; filename=" + codeContent + ".jpg");
        response.setDateHeader("Expires", 0);
        OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
        toClient.write(outputStream.toByteArray()); // 输出数据
        toClient.close();
    }

    @Override
    public Object getModel() {
        if (equipmentEntity == null) {
            equipmentEntity = new EquipmentEntity();
        }
        return equipmentEntity;
    }

    public EquipmentEntity getEquipmentEntity() {
        return equipmentEntity;
    }

    public void setEquipmentEntity(EquipmentEntity equipmentEntity) {
        this.equipmentEntity = equipmentEntity;
    }

    public EquipService getEquipService() {
        return equipService;
    }

    public void setEquipService(EquipService equipService) {
        this.equipService = equipService;
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent;
    }
}
