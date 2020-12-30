package com.feel.baking;

public class FeelCookBook {


    public Recipe getApplePieRecipe(){
       RecipeImpl applePieRecipe = new RecipeImpl("Apple Pie");
       applePieRecipe.addIngredient("apples", "1kg");
       applePieRecipe.addIngredient("flour", "500gr");
       applePieRecipe.addIngredient("sugar", "300gr");
       applePieRecipe.addIngredient("butter", "100gr");

       return applePieRecipe;



    }

    public Recipe getBreakfastBurritoRecipe(){
        RecipeImpl breakfastBurritoRecipe = new RecipeImpl("Breakfast Burrito");
        breakfastBurritoRecipe.addIngredient("bacon", "500gr");
        breakfastBurritoRecipe.addIngredient("cheese", "250gr");
        breakfastBurritoRecipe.addIngredient("eggs", "2");
        breakfastBurritoRecipe.addIngredient("potatoes", "500gr");
        breakfastBurritoRecipe.addIngredient("tortillia", "1 or 2");

        return breakfastBurritoRecipe;
    }
}
