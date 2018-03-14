package com.rioverde.whiteboards;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test_M_H {

    @Test
    public void test10() {

        assertEquals(23L, M_H._3or5Sum(10));

    }

    @Test
    public void test1000() {

        assertEquals(233168L, M_H._3or5Sum(1000));

    }


}
