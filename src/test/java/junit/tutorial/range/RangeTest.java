package junit.tutorial.range;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class RangeTest {
    @DataPoints
    public static Fixture[] PARAMs = {new Fixture(0.0, 10.5, -0.1, false), new Fixture(0.5, 10.5, 0.0, false),
            new Fixture(1.0, 10.5, 1.0, true), new Fixture(1.0, 10.0, 5.0, true), new Fixture(2.0, 10.5, 10.5, true),
            new Fixture(2.0, 10.6, 10.7, false), };

    @Theory
    public void test(Fixture p) throws Exception {
        Range range = new Range(p.x, p.y);
        assertThat(range.contains(p.z), is(p.expected));
    }

    static class Fixture {
        double x;

        double y;
        
        double z;

        boolean expected;

        Fixture(double x, double y, double z, boolean expected) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.expected = expected;
        }
    }
}
