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

public class AdditionTest 
{
    @Test
    public void twoPlusTwoEqualsFour()
    {
        Addition addition = new Addition();
        assertEquals(4, addition.userInputs(2, 2));
        
    }

    @Test
    public void threePlusFourEqualsSeven()
    {
        Addition addition = new Addition();
        assertEquals(7, addition.userInputs(3, 4));
    }

    @Test
    public void resultIsNotNegative()
    {
        Addition addition = new Addition();
        assertTrue(addition.userInputs(2, 2) > 0);
    }
}
