package com.feel.baking;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreakfastBurritoRecipeTest {

    private static Recipe recipe;

    @BeforeAll
    public static void preparePie() {

        FeelCookBook cookBook = new FeelCookBook();
        recipe =  cookBook.getBreakfastBurritoRecipe();
    }

//    @Test
//    void testNumberOfIngredients() {
//        List<String> pieIngredients = recipe.getIngredientsList();
//        assertTrue(4 == pieIngredients.size());
//    }

    @Test
    void testRecipeName() {
        String recipeName = recipe.getRecipeName();
        assertEquals("Breakfast Burrito", recipeName);
    }

}
