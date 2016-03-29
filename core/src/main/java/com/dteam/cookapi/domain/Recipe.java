package com.dteam.cookapi.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Recipe {
    @Id
    private ObjectId id;

    private String lastName;

    private SomeObj objs;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SomeObj getObjs() {
        return objs;
    }

    public void setObjs(SomeObj objs) {
        this.objs = objs;
    }
}
