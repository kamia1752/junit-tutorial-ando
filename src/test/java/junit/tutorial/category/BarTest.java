// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(FastTests.class)
public class BarTest {
    @Test
    public void test01() throws Exception {
        // SetUp
        // Exercise
        // Verify
        System.out.println("BarTest#test01");
    }

    @Test
    public void test02() throws Exception {
        // SetUp
        // Exercise
        // Verify
        System.out.println("BarTest#test02");
    }

}
