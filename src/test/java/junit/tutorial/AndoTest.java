// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static junit.tutorial.matchers.IsDate.dateOf;

import java.util.Date;

import org.junit.Test;

public class AndoTest {
@Test
public void 失敗するテスト() throws Exception {
    // SetUp
    // Exercise
    // Verify
    assertThat(new Date(),is(dateOf(2011, 2, 10)));
}

}
