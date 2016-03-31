package com.dteam.cookapi.domain.parsers;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class ParsedRecipes {
    List<String> ingridients;

    public List<String> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List<String> ingridients) {
        this.ingridients = ingridients;
    }
}
