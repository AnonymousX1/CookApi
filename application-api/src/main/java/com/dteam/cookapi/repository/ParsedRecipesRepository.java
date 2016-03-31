package com.dteam.cookapi.repository;

import com.dteam.cookapi.domain.parsers.ParsedRecipes;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vladlen on 16.31.3.
 */
public interface ParsedRecipesRepository extends CrudRepository<ParsedRecipes, Long> {
}
