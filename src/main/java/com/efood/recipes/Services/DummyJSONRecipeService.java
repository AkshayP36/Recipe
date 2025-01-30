package com.efood.recipes.Services;

import com.efood.recipes.Dto.RecipeDto;
import com.efood.recipes.Models.Recipe;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Recipe> getAllRecipes() {
        try{
            RecipeDto[] recipeDtos = restTemplate.getForObject("https://dummyjson.com/recipes", RecipeDto[].class);
            if(recipeDtos!=null){
                List<Recipe> recipe = List.of(recipeDtos).stream()
                        .map(RecipeDto::getRecipeData)
                        .collect(Collectors.toList());

                return recipe;
            }else{
                throw new RuntimeException("No Recipes yet");
            }

        }catch(Exception e){
            throw new RuntimeException("Error fetching recipe list");
        }

    }

    @Override
    public List<String> getAllRecipesTags() {
        RecipeDto[] recipeDtos = restTemplate.getForObject("https://dummyjson.com/recipes/tags", RecipeDto[].class);
//        List<String> tagList = List.of(recipeDtos).stream()
//                .map(RecipeDto::getTags)
//                .collect(Collectors.toList());
        return null;
    }
}
