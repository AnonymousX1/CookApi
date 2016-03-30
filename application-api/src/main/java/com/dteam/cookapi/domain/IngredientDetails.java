package com.dteam.cookapi.domain;

/**
 * Created by vladlen on 16.29.3.
 */
public class IngredientDetails {

    private String name;
    private String measurement;
    private String subType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}
