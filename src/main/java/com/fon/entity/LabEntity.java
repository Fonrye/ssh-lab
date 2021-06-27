package com.fon.entity;

import java.util.Objects;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/27 22:07
 **/
public class LabEntity {
    private long labId;
    private String labName;
    private Integer computerNum;
    private String labTeacher;
    private String labTechnician;

    public long getLabId() {
        return labId;
    }

    public void setLabId(long labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public Integer getComputerNum() {
        return computerNum;
    }

    public void setComputerNum(Integer computerNum) {
        this.computerNum = computerNum;
    }

    public String getLabTeacher() {
        return labTeacher;
    }

    public void setLabTeacher(String labTeacher) {
        this.labTeacher = labTeacher;
    }

    public String getLabTechnician() {
        return labTechnician;
    }

    public void setLabTechnician(String labTechnician) {
        this.labTechnician = labTechnician;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabEntity labEntity = (LabEntity) o;
        return labId == labEntity.labId &&
                Objects.equals(labName, labEntity.labName) &&
                Objects.equals(computerNum, labEntity.computerNum) &&
                Objects.equals(labTeacher, labEntity.labTeacher) &&
                Objects.equals(labTechnician, labEntity.labTechnician);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labId, labName, computerNum, labTeacher, labTechnician);
    }
}
