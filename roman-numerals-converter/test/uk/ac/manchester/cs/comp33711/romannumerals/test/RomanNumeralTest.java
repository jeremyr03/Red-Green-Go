package uk.ac.manchester.cs.comp33711.romannumerals.test;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.manchester.cs.comp33711.romannumerals.RomanNumeral;

public class RomanNumeralTest {
	
	@Test
	public void shouldConvertArabicOne(){
		RomanNumeral romanNumeral = new RomanNumeral(1);
		assertEquals("I", romanNumeral.toString());
	}

    @Test
    public void shouldConvertArabicTwo(){
        RomanNumeral romanNumeral = new RomanNumeral(2);
        assertEquals("II", romanNumeral.toString());
    }

    @Test
    public void shouoldConvertArabicThree(){
        RomanNumeral romanNumeral = new RomanNumeral(3);
        assertEquals("III", romanNumeral.toString());
    }

    @Test
    public void shouoldConvertArabicFour(){
        RomanNumeral romanNumeral = new RomanNumeral(4);
        assertEquals("IV", romanNumeral.toString());
    }

    @Test
    public void shouldConvertArabicFive(){
        RomanNumeral romanNumeral = new RomanNumeral(5);
        assertEquals("V", romanNumeral.toString());
    }

    @Test
    public void shouldConvertArabicSix(){
        RomanNumeral romanNumeral = new RomanNumeral(6);
        assertEquals("VI", romanNumeral.toString());
    }

    @Test
    public void shouldConvertArabicTen(){
        RomanNumeral romanNumeral = new RomanNumeral(10);
        assertEquals("X", romanNumeral.toString());
    }

    @Test
    public void shouldConvertArabicEleven(){
        RomanNumeral romanNumeral = new RomanNumeral(11);
        assertEquals("XI", romanNumeral.toString());
    }

}
