package com.dteam.cookapi.controllers;

import com.dteam.cookapi.domain.*;
import com.dteam.cookapi.repository.RecipeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class TestController {

    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping("/test")
    public ResponseEntity<List<Recipe>> test() {
        Recipe rec = new Recipe();
        rec.setId(ObjectId.createFromLegacyFormat(4, 3, 7));
        List<CookingStep> cookingSteps = new ArrayList<>();
        CookingStep cookingStep = new CookingStep();
        cookingStep.setImageURL("http:imageLink");
        cookingStep.setLikes(-4);
        cookingStep.setStepText("Pochstitj Kartoshku");
        cookingStep.setTimer(LocalTime.MAX);
        cookingStep.setVideoURL("http:videoLink");
        cookingSteps.add(cookingStep);
        cookingStep.setImageURL("http:imageLink");
        cookingStep.setLikes(-10);
        cookingStep.setStepText("Pochstitj Morkovku");
        cookingStep.setTimer(LocalTime.MAX);
        cookingStep.setVideoURL("http:videoLink");
        cookingSteps.add(cookingStep);
        rec.setCookingSteps(cookingSteps);
        Set<HashTag> hashTags = new HashSet<>();
        HashTag hashTag = new HashTag();
        hashTag.setHashTag("Gorjachee");
        hashTags.add(hashTag);
        hashTag.setHashTag("Holodnoe");
        hashTags.add(hashTag);
        rec.setHashTags(hashTags);
        rec.setCookingTime(LocalTime.MIDNIGHT);
        rec.setSummary("Pod pivo samoe to");
        IngredientDetails ingredientDetails = new IngredientDetails();
        ingredientDetails.setMeasurement("Grammi");
        ingredientDetails.setName("Solj");
        ingredientDetails.setSubType("Povarenaja");
        Ingredient ingredient = new Ingredient();
        ingredient.setIngredientDetails(ingredientDetails);
        ingredient.setOptional(false);
        ingredient.setValue(100);
        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(ingredient);
        ingredientDetails.setMeasurement("Shtuki");
        ingredientDetails.setName("Riba");
        ingredientDetails.setSubType("Vobla");
        ingredient.setIngredientDetails(ingredientDetails);
        ingredient.setOptional(true);
        ingredient.setValue(2);
        ingredients.add(ingredient);
        rec.setIngredients(ingredients);
        rec.setRecipeVideo("http:recVideo");
        rec.setRecipeImage("http:recImage");
        rec.setLikes(5);
        recipeRepository.save(rec);
        List recipel = (List) recipeRepository.findAll();
        return new ResponseEntity<>(recipel, HttpStatus.OK);
    }
}
