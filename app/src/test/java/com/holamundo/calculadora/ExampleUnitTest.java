package com.holamundo.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void sumar_dos_numeros(){

        double a= 4, b=6,c;
        c= 10;

        assertEquals(c,Metodos.sumar(a,b),0);
    }

    @Test
    public void restar_dos_numeros(){

        double a= 4, b=6,c;
        c= -2;

        assertEquals(c,Metodos.resta(a,b),0);
    }

    @Test
    public void multiplicar_dos_numeros(){

        double a= 4, b=6,c;
        c= 24;

        assertEquals(c,Metodos.multiplicacion(a,b),0);
    }

    @Test
    public void dividir_dos_numeros(){

        double a= 4, b=6,c;
        c= a/b;

        assertEquals(c,Metodos.division(a,b),0);
    }



}