package io.viktar.cookingrecipeapp.repositories;

import io.viktar.cookingrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
