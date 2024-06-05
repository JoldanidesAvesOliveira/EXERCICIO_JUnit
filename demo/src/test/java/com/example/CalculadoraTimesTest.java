package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTimesTest {

    CalculadoraTimes calculo = new CalculadoraTimes();


    @Test
    public void mult(){
        assertEquals(25, calculo.calc(5, 5));
    }
    
}
