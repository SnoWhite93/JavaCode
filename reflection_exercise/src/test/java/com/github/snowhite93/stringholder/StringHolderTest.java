package com.github.snowhite93.stringholder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class StringHolderTest {

    private static StringHolder stringHolder;

    @BeforeAll
    public static void setupTests() {
        stringHolder = new StringHolder();
    }

    @BeforeEach
    public void prepareTest() {
        stringHolder.reset();
    }

    @Test
    public void testWhenNothingInside() {
        assertFalse(stringHolder.hasValue());
    }

    @Test
    public void testStoringWorks() {
        stringHolder.holdValue("hello");
        assertTrue(stringHolder.hasValue());
    }

    @Test
    public void testResetRemovesValue() {
        stringHolder.holdValue("hello");
        stringHolder.reset();
        assertFalse(stringHolder.hasValue());
    }

    @Test
    public void testReturnWhatIsStored() {
        stringHolder.holdValue("hello");
        assertEquals("hello", stringHolder.getStoredString());
    }

    @Test
    public void testFailIntentionallyBecauseThrows() {
        assertThrows(SQLException.class, () -> {
            stringHolder.getStoredString();
        });
    }

    @Test
    public void testFailIntentionallyBecauseWrongValue() {
        assertEquals("hello", stringHolder.getStoredString());
    }

}