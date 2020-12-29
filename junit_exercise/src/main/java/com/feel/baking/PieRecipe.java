package com.feel.baking;

import exceptions.BadIngredientException;

import java.util.Arrays;
import java.util.List;

public class PieRecipe {

    public List<String> getIngredients() {
        List<String> ingredientsList = Arrays.asList(
                "flour", "sugar", "eggs", "apple", "butter"
        );

        return ingredientsList;
    }

    public String getIngredientQuantity(String ingredient) throws BadIngredientException {
        if ("flour".equals(ingredient)) {
            return "500gr";
        } else if ("eggs".equals(ingredient)) {
            return "5";
        } else if ("sugar".equals(ingredient)) {
            return "300gr";
        } else if ("apple".equals(ingredient)) {
            return "4";
        } else if ("butter".equals(ingredient)) {
            return "2TBS";
        }else{
                throw new BadIngredientException("There is no such ingredient as " + ingredient + " for this recipe");
            }

        }

    }
