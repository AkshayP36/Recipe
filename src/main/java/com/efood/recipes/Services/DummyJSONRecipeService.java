package com.efood.recipes.Services;

import com.efood.recipes.Dto.RecipeDto;
import com.efood.recipes.Models.Recipe;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DummyJSONRecipeService implements RecipeService{
    RestTemplate restTemplate;

    public DummyJSONRecipeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Recipe getASingleRecipe(Long id) {
        RecipeDto recipe = restTemplate.getForObject("https://dummyjson.com/recipes/"+id, RecipeDto.class);
        return recipe.getRecipeData();
    }
}
