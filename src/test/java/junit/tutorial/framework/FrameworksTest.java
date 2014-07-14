package junit.tutorial.framework;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.nio.file.Files;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FrameworksTest {

//    @DataPoints
//    public static Fixture[] getParams() {
//        InputStream in = Test.class.getResourceAsStream("test.txt");
//        Files.readAllLines(Paths, cs)
//    }
    
    @Theory
    public void add(Fixture p) throws Exception {
        Frameworks sut = new Frameworks();
        assertThat(sut.isSupport(p.x, p.y), is(p.expected));
    }
    
    static class Fixture {
        String x;
        String y;
        boolean expected;
        
        Fixture(String x,String y,boolean expected) {
            this.x = x;
            this.y = y;
            this.expected = expected;
        }
    }

}
