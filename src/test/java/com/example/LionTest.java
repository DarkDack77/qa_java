package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void getKittensReturnsOne() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(1);

        Lion lion = new Lion("Самец", feline);

        assertEquals(1, lion.getKittens());
        verify(feline).getKittens();
    }

    @Test
    public void getFoodReturnsFoodList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", feline);

        assertEquals(3, lion.getFood().size());
        verify(feline).getFood("Хищник");
    }

    @Test
    public void constructorThrowsExceptionForInvalidSex() throws Exception {
        Feline feline = mock(Feline.class);

        exception.expect(Exception.class);
        exception.expectMessage("Используйте допустимые значения пола животного - самей или самка");

        new Lion("Неизвестно", feline);
    }
}