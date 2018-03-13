package com.rioverde.whiteboards;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class C_V_Tests {

    @Test
    public void testArrayReverse() {
        int [] arr = new int[] {1,2,3,4,5};

        assertArrayEquals(new int[]{5,4,3,2,1}, C_V.reverseArray(arr));
    }


    @Test
    public void testRemoveSingleVowel1() {
        String s = "Car";

        assertEquals("Cr", C_V.removeSingleVowel(s));
    }

    @Test
    public void testRemoveSingleVowel2() {
        String s = "Look";

        assertEquals("Look", C_V.removeSingleVowel(s));
    }
    @Test
    public void testRemoveSingleVowel3() {
        String s = "Solo";

        assertEquals("Sl", C_V.removeSingleVowel(s));
    }
    @Test
    public void testRemoveSingleVowel4() {
        String s = "Ooolong";

        assertEquals("Oolng", C_V.removeSingleVowel(s));
    }
}


