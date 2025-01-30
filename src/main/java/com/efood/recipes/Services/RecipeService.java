package com.efood.recipes.Services;

import com.efood.recipes.Models.Recipe;

import java.util.List;

public interface RecipeService {
    public Recipe getASingleRecipe(Long id);
    public List<Recipe> getAllRecipes();
    public List<String> getAllRecipesTags();
}
