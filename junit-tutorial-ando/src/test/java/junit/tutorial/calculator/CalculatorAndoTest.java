// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.calculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import junit.tutorial.Calculator;

import org.junit.Test;

public class CalculatorAndoTest {

    @Test
    public void addは3と４で７を返す() throws Exception{
        CalculatorAndo sut = new CalculatorAndo();
        assertThat(sut.add(3,4), is(7));
    }
    
    @Test
    public void addは5と1で6を返す() throws Exception {
        CalculatorAndo sut = new CalculatorAndo();
        assertThat(sut.add(1,5), is(6));
    }

}
