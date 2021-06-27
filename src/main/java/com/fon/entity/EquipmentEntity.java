package com.fon.entity;

import java.util.Objects;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/28 10:20
 **/
public class EquipmentEntity {
    private String equipment;
    private String equipId;
    private String equipName;
    private String equipType;
    private String equipBirth;
    private String warrantyDate;
    private String equipFactory;

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public String getEquipBirth() {
        return equipBirth;
    }

    public void setEquipBirth(String equipBirth) {
        this.equipBirth = equipBirth;
    }

    public String getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(String warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public String getEquipFactory() {
        return equipFactory;
    }

    public void setEquipFactory(String equipFactory) {
        this.equipFactory = equipFactory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentEntity that = (EquipmentEntity) o;
        return Objects.equals(equipment, that.equipment) &&
                Objects.equals(equipId, that.equipId) &&
                Objects.equals(equipName, that.equipName) &&
                Objects.equals(equipType, that.equipType) &&
                Objects.equals(equipBirth, that.equipBirth) &&
                Objects.equals(warrantyDate, that.warrantyDate) &&
                Objects.equals(equipFactory, that.equipFactory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipment, equipId, equipName, equipType, equipBirth, warrantyDate, equipFactory);
    }
}
