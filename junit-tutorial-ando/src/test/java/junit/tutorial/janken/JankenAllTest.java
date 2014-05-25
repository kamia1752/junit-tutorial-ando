// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.janken;

import static junit.tutorial.janken.Janken.Hand.*;
import static junit.tutorial.janken.Janken.Result.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class JankenAllTest {

    protected static class Fixture {
        Janken.Hand x;
        Janken.Hand y;
        Janken.Result expected;
        
        Fixture(Janken.Hand x, Janken.Hand y, Janken.Result expeted) {
            this.x = x;
            this.y = y;
            this.expected = expeted;
        }
    }

    @RunWith(Theories.class)
    public static class ジャンケンのパラメータ化テスト {
        @DataPoints
        public static Fixture[] 勝ちパターンのセット = {
            new Fixture(GU, TYOKI, WIN),
            new Fixture(TYOKI, PA, WIN),
            new Fixture(PA, GU, WIN),
            new Fixture(GU, GU, DRAW),
            new Fixture(TYOKI, TYOKI, DRAW),
            new Fixture(PA, PA, DRAW),
            new Fixture(GU, PA, WIN),
            new Fixture(TYOKI, GU, LOSE),
            new Fixture(PA, TYOKI, LOSE),
        };
        
        @Theory
        public void 勝ちパターンのテスト(Fixture fixture) throws Exception {
            // SetUp
            
            // Exercise

            // Verify
            Janken sut = new Janken();
            assertThat(sut.judge(fixture.x,fixture.y), is(fixture.expected));
        }
        
    } 
    
    
}
