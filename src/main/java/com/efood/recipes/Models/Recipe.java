package com.efood.recipes.Models;

public class Recipe {

    private Long id;
    private String name;
    private String[] ingredients;
    private String[] instructions;
    private Integer prepTimeMinutes;
    private Integer cookTimeMinutes;
    private Integer servings;
    private String difficulty;
    private String cuisine;
    private Integer caloriesPerServing;
    private String[] tags;
    private Integer userId;
    private String image;
    private Double rating;
    private Integer reviewCount;
    private String[] mealType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }

    public Integer getPrepTimeMinutes() {
        return prepTimeMinutes;
    }

    public void setPrepTimeMinutes(Integer prepTimeMinutes) {
        this.prepTimeMinutes = prepTimeMinutes;
    }

    public Integer getCookTimeMinutes() {
        return cookTimeMinutes;
    }

    public void setCookTimeMinutes(Integer cookTimeMinutes) {
        this.cookTimeMinutes = cookTimeMinutes;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public Integer getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(Integer caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String[] getMealType() {
        return mealType;
    }

    public void setMealType(String[] mealType) {
        this.mealType = mealType;
    }

    public Recipe() {
    }

    public Recipe(Long id, String name, String[] ingredients, String[] instructions,
                  Integer prepTimeMinutes, Integer cookTimeMinutes, Integer servings, String difficulty,
                  String cuisine, Integer caloriesPerServing, String[] tags, Integer userId, String image, Double rating, Integer reviewCount, String[] mealType) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.prepTimeMinutes = prepTimeMinutes;
        this.cookTimeMinutes = cookTimeMinutes;
        this.servings = servings;
        this.difficulty = difficulty;
        this.cuisine = cuisine;
        this.caloriesPerServing = caloriesPerServing;
        this.tags = tags;
        this.userId = userId;
        this.image = image;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.mealType = mealType;
    }
}

