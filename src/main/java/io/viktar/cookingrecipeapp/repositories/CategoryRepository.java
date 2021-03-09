package io.viktar.cookingrecipeapp.repositories;

import io.viktar.cookingrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
