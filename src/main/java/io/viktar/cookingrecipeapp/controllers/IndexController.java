package io.viktar.cookingrecipeapp.controllers;

import io.viktar.cookingrecipeapp.domain.Category;
import io.viktar.cookingrecipeapp.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping({"/", ""})
    public String getIndexPage() {
        return "index";
    }
}