package com.fon.entity;

import java.util.Objects;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 10:20
 **/
public class ApplyEntity {
    private String applyId;
    private String department;
    private String equipName;
    private String equipLab;
    private String equipId;
    private String applyPerson;
    private String equipType;
    private String description;
    private String reason;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipLab() {
        return equipLab;
    }

    public void setEquipLab(String equipLab) {
        this.equipLab = equipLab;
    }

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId;
    }

    public String getApplyPerson() {
        return applyPerson;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplyEntity that = (ApplyEntity) o;
        return Objects.equals(applyId, that.applyId) &&
                Objects.equals(department, that.department) &&
                Objects.equals(equipName, that.equipName) &&
                Objects.equals(equipLab, that.equipLab) &&
                Objects.equals(equipId, that.equipId) &&
                Objects.equals(applyPerson, that.applyPerson) &&
                Objects.equals(equipType, that.equipType) &&
                Objects.equals(description, that.description) &&
                Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyId, department, equipName, equipLab, equipId, applyPerson, equipType, description, reason);
    }
}
