// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.janken;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static junit.tutorial.janken.Janken.Hand.*;
import static junit.tutorial.janken.Janken.Result.*;
import org.junit.Before;
import org.junit.Test;

public class JankenTest {

    private Janken sut;

    @Before
    public void setUp() throws Exception {
        sut = new Janken();
    }

    @Test
    public void グーとチョキなら勝利() throws Exception {
        // SetUp
        // Exercise

        // Verify
        assertThat(sut.judge(Janken.Hand.GU, Janken.Hand.TYOKI), is(Janken.Result.WIN));
    }

    @Test
    public void グーとバーなら敗北() throws Exception {
        // SetUp

        // Exercise

        // Verify
        assertThat(sut.judge(Janken.Hand.GU, Janken.Hand.PA), is(Janken.Result.LOSE));
    }
    
    @Test
    public void グーとグーならあいこ() throws Exception {
        // SetUp
        
        // Exercise

        // Verify
        assertThat(sut.judge(GU,GU), is(DRAW));
    }

}
