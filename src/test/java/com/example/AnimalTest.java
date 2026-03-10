package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFoodReturnsHerbivoreFood() throws Exception {
        Animal animal = new Animal();

        List<String> food = animal.getFood("Травоядное");

        assertEquals(2, food.size());
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionForUnknownAnimal() throws Exception {
        Animal animal = new Animal();

        animal.getFood("Неизвестное");
    }
}