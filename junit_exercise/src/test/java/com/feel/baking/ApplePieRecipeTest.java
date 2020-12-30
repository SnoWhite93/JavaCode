package com.feel.baking;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplePieRecipeTest {

    private static Recipe recipe;

    @BeforeAll
    public static void preparePie() {

        FeelCookBook cookBook = new FeelCookBook();
        recipe =  cookBook.getApplePieRecipe();
    }

//    @Test
//    void testNumberOfIngredients() {
//        List<String> pieIngredients = recipe.getIngredientsList();
//        assertTrue(4 == pieIngredients.size());
//    }

    @Test
    void testRecipeName() {
        String recipeName = recipe.getRecipeName();
        assertEquals("Apple Pie", recipeName);
    }

}
