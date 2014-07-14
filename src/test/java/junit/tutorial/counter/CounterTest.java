package junit.tutorial.counter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CounterTest {

	private Counter sut;

	@Before
	public void before() throws Exception {
		sut = new Counter();
	}

	@Test
	public void incrementメソッドを１回実行するテスト() {
		assertThat(sut.increment(), is(1));
	}

	@Test
	public void incrementメソッドを2回実行するテスト() {
		sut.increment();
		assertThat(sut.increment(), is(2));
	}

	@Test
	public void incrementメソッドを30回実行するテスト() {
		for(int i = 0; i < 30; i++) sut.increment();
		assertThat(sut.increment(), is(31));
	}
}
