package com.example.solid.principles;

//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
/* import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;*/

class AddTest 
{
    @Test
    void twoPlusTwoEqualsFour()
    {
        Addition addition = new Addition();
        assertEquals(4, addition.userInputs(2, 2));
        System.out.println("Yeah, your addition logic works");
        
    }

    @Test
    void threePlusFourEqualsSeven()
    {
        Addition addition = new Addition();
        assertEquals(7, addition.userInputs(3, 4));
        System.out.println("Yeah, your addition logic really works");
    }

    @Test
    void resultIsNotNegative()
    {
        Addition addition = new Addition();
        assertTrue(addition.userInputs(2, 2) > 0);
        System.out.println("Yeah, your addition spits out positive numbers");
    }
}
