// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdultSiteTest {

    @Test
    public void _18以上の値() {
        int age = 20;
        boolean actual = AdultSite.canRegister(age);
        assertThat(actual, is(true));
    }
    
    @Test
    public void _18未満の値() throws Exception {
        // Setup
        int age = 10;
        // Exercise
        boolean actual = AdultSite.canRegister(age);
        // Verify
        assertThat(actual,is(false));
    }
    
    

}
