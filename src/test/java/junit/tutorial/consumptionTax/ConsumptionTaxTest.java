package junit.tutorial.consumptionTax;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
@RunWith(Theories.class)
public class ConsumptionTaxTest {

    @DataPoints
    public static Fixture[] PARAMs = {
        new Fixture(5,100,105),
        new Fixture(5,3000,3150),
        new Fixture(10,50, 55),
        new Fixture(5, 50, 52),
        new Fixture(3, 50, 51),
    };
    
    @Theory
    public void フィクスチャを用いたテスト(Fixture p) throws Exception{
        ConsumptionTax consumptionTax = new ConsumptionTax(p.rate);
        assertThat(consumptionTax.apply(p.value), is(p.expected));
    }
    
    static class Fixture {
        int rate;
        int value;
        int expected;
        Fixture(int rate, int value, int expected) {
            this.rate = rate;
            this.value = value;
            this. expected = expected;
        }
    }
    

}
