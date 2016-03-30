package com.dteam.cookapi.repository;

import com.dteam.cookapi.domain.recipe.Recipe;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RecipeRepository extends CrudRepository<Recipe, ObjectId> {
}
