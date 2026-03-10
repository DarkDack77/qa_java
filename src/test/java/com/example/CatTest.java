package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String sound = cat.getSound();

        assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        List<String> food = cat.getFood();

        assertEquals(3, food.size());
    }

    @Test
    public void getFoodCallsFelineMethod() throws Exception {

        Feline feline = mock(Feline.class);

        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(feline);

        List<String> food = cat.getFood();

        assertEquals(3, food.size());

        verify(feline).eatMeat();
    }
}