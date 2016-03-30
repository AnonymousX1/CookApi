package com.dteam.cookapi.domain.ingredient;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
public class Ingredient {

    @Id
    private ObjectId id;
    private String name;
    private Set<String> measurements;
    private Set<String> subTypes;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Set<String> measurements) {
        this.measurements = measurements;
    }

    public Set<String> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(Set<String> subTypes) {
        this.subTypes = subTypes;
    }
}
