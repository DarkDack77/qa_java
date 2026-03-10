package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyReturnsFelineFamily() {
        Feline feline = new Feline();

        String family = feline.getFamily();

        assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensWithoutParamsReturnsOne() {
        Feline feline = new Feline();

        int kittens = feline.getKittens();

        assertEquals(1, kittens);
    }

    @Test
    public void getKittensWithParamsReturnsPassedValue() {
        Feline feline = new Feline();

        int kittens = feline.getKittens(5);

        assertEquals(5, kittens);
    }

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();

        List<String> food = feline.eatMeat();

        assertEquals(3, food.size());
    }
}