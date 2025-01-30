package com.efood.recipes.Controllers;

import com.efood.recipes.Models.Recipe;
import com.efood.recipes.Services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/{id}")
    public Recipe getASingleRecipe(@PathVariable("id") Long id){
        Recipe recipe = recipeService.getASingleRecipe(id);
        return recipe;
    }
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(){
        List<Recipe> recipeList = recipeService.getAllRecipes();
        return recipeList;
    }

    public List<String> getAllRecipesTags(){
        List<String> tagsList = recipeService.getAllRecipesTags();
        return tagsList;
    }
}
