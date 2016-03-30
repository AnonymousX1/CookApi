package com.dteam.cookapi.domain;

/**
 * Created by vladlen on 16.29.3.
 */
public class Ingredient {
    private float value;
    private boolean optional;
    private IngredientDetails ingredientDetails;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public IngredientDetails getIngredientDetails() {
        return ingredientDetails;
    }

    public void setIngredientDetails(IngredientDetails ingredientDetails) {
        this.ingredientDetails = ingredientDetails;
    }
}
