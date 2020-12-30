package com.feel.baking;

import exceptions.BadIngredientException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeImpl implements Recipe {

    private String recipeName;

    public RecipeImpl(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public List<String> getIngredientsList() {
        List<String> ingredientsList = new ArrayList<>();
        return ingredientsList;
    }

    @Override
    public String getIngredientQuantity(String ingredientName) throws BadIngredientException {
        return null;
    }

    @Override
    public String getRecipeName() {
        return recipeName;
    }

    public void addIngredient(String ingredientName, String quantity) {
        Map<String, String> ingredientMap = new HashMap<>();
        ingredientMap.put(ingredientName, quantity);
    }

}
