package com.dteam.cookapi.repository;

import com.dteam.cookapi.domain.ingredient.Ingredient;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vladlen on 16.30.3.
 */
public interface IngredientRepository extends CrudRepository<Ingredient, ObjectId> {
}
