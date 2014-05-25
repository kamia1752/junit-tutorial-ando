// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

public class RandomsMockTest {

    @Test
    public void choiceでAを返す() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        Randoms sut = new Randoms();
        // モックの設定
        final AtomicBoolean isCallNextIntMethod = new AtomicBoolean(false);
        sut.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                isCallNextIntMethod.set(true);
                return 0;
            }
        };
        assertThat(sut.choice(options), is("A"));
        assertThat(isCallNextIntMethod.get(), is(true));
    }

}
