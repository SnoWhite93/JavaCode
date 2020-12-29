package com.feel.baking;

import exceptions.BadIngredientException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PieRecipeTest {

    private static PieRecipe pieRecipe;

    @BeforeAll
    public static void preparePie() {
        pieRecipe = new PieRecipe();
    }

    @Test
    void testNumberOfIngredients() {
        List<String> pieIngredients = pieRecipe.getIngredients();
        assertTrue(5 == pieIngredients.size());
//        assertEquals(5, pieIngredients.size() );
    }

    @Test
    void testPieContainsFlour() {
        List<String> pieIngredients = pieRecipe.getIngredients();
        assertTrue(pieIngredients.contains("flour"));
    }

    @Test
    void testPieContainsCocoa() {
        List<String> pieIngredients = pieRecipe.getIngredients();
        assertFalse(pieIngredients.contains("cocoa"));
    }

    @Test
    void testFlourQuantity() {
        String flourQuantity = pieRecipe.getIngredientQuantity("flour");
//      assertTrue("500gr".equals(quantity));
        assertEquals("500gr", flourQuantity);
    }

    @Test
    void testEggQuantity() {
        String eggQuantity = pieRecipe.getIngredientQuantity("eggs");
        assertEquals("5", eggQuantity);
    }

    @Test
    void testBeerQuantity() {
        assertThrows(BadIngredientException.class, () -> {
            pieRecipe.getIngredientQuantity("beer");
        });

    }

    @Test
    void testPieContainsFaucet() {
        List<String> pieRecipeIngredients = pieRecipe.getIngredients();
        assertFalse(pieRecipeIngredients.contains("faucet"));

    }

    @Test
    void testPieContainsLightBulb() {
        List<String> pieRecipeIngredients = pieRecipe.getIngredients();
        assertFalse(pieRecipeIngredients.contains("light bulb"));
    }

    @Test
    void testPieContainsGoat(){
        List<String> pieRecipeIngredients = pieRecipe.getIngredients();
        assertFalse(pieRecipeIngredients.contains("goat"));
    }

    @Test
    void testPieContainsSourCream(){
        List<String> pieRecipeIngredients = pieRecipe.getIngredients();
        assertFalse(pieRecipeIngredients.contains("sour cream"));
    }

    @Test
    void testPieContainsIpad(){
       assertThrows(BadIngredientException.class, () -> {
           pieRecipe.getIngredientQuantity("Ipad");
       });
    }

}