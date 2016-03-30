package com.dteam.cookapi.controllers;

import com.dteam.cookapi.domain.ingredient.Ingredient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public ResponseEntity<Ingredient> test() {
        Ingredient ingredient = new Ingredient();
        return new ResponseEntity<>(ingredient, HttpStatus.OK);
    }
}
