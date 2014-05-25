// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FooTest {
    @Category(FastTests.class)
    @Test
    public void fastTest() throws Exception {
        // SetUp
        // Exercise
        // Verify
        System.out.println("FooTest#fastTest");
    }

    @Category(SlowTests.class)
    @Test
    public void slowTest() throws Exception {
        // SetUp
        // Exercise
        // Verify
        System.out.println("FooTest#slowTest");
    }

}
