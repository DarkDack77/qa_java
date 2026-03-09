package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void maleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionHasNoMane() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getKittensReturnsOne() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> food = lion.getFood();
        assertEquals(3, food.size());
    }

    @Test
    public void constructorWithInvalidSexThrowsException() throws Exception {
        exception.expect(Exception.class);
        exception.expectMessage("Используйте допустимые значения пола животного - самей или самка");

        new Lion("Неизвестно");
    }
}