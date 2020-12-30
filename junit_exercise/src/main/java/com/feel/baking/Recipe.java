package com.feel.baking;

import exceptions.BadIngredientException;

import java.util.List;

public interface Recipe {


    public List<String> getIngredientsList();

    public String getIngredientQuantity(String ingredientName) throws BadIngredientException;

    public String getRecipeName();


}
