package com.dteam.cookapi.controllers;

import com.dteam.cookapi.domain.Recipe;
import com.dteam.cookapi.domain.SomeObj;
import com.dteam.cookapi.repository.RecipeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TestController {

    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping("/test")
    public ResponseEntity<List<Recipe>> test() {
        Recipe rec = new Recipe();
        SomeObj someObj = new SomeObj();
        someObj.setField1("String");
        someObj.setField2(4);
        rec.setId(ObjectId.createFromLegacyFormat(1, 2, 5));
        rec.setLastName("Trololol");
        rec.setObjs(someObj);
        List recipel = (List) recipeRepository.findAll();
        return new ResponseEntity<>(recipel, HttpStatus.OK);
    }
}
