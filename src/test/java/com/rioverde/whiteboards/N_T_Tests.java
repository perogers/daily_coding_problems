package com.rioverde.whiteboards;

import org.junit.Test;
import static org.junit.Assert.*;


public class N_T_Tests {


    @Test
    public void test1() {
        String s = "hello world";

        assertEquals("helloWorld", N_T.toCamelCase(s));
    }

    @Test
    public void test2() {
        String s = "HTTP this is another";

        assertEquals("httpThisIsAnother", N_T.toCamelCase(s));
    }

    @Test
    public void test3() {
        String s = "this is another 42";

        assertEquals("thisIsAnother42", N_T.toCamelCase(s));
    }
}
