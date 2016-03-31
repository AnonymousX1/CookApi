package com.dteam.cookapi.controllers;

import com.dteam.cookapi.domain.parsers.ParsedIngredientsList;
import com.dteam.cookapi.domain.parsers.ParsedRecipes;
import com.dteam.cookapi.repository.ParsedRecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class TestController {

    @Autowired
    private ParsedRecipesRepository parsedRecipesRepository;

    @RequestMapping("/test")
    public ResponseEntity<ParsedIngredientsList> test() {
        ParsedIngredientsList parsedIngredientsList = new ParsedIngredientsList();
        List<ParsedRecipes> parsedRecipesList = (List<ParsedRecipes>) parsedRecipesRepository.findAll();
        Set<String> tmpIngredients = new HashSet<>();
        parsedRecipesList.forEach(value -> value.getIngridients().forEach
                (subList -> tmpIngredients.add(subList.toLowerCase())));
        List<String> tmpParsedIngredient = new ArrayList<>();
        tmpIngredients.forEach(tmpParsedIngredient::add);
        tmpParsedIngredient.sort(String::compareTo);
        parsedIngredientsList.setIngredients(tmpParsedIngredient);
        return new ResponseEntity<>(parsedIngredientsList, HttpStatus.OK);
    }
}
