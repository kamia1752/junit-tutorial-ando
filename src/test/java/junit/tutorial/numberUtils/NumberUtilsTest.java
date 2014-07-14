package junit.tutorial.numberUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class NumberUtilsTest {

	public static class 値が2の場合のテスト {
		private NumberUtils sut;

		@Before
		public void before() throws Exception {
			sut = new NumberUtils();
		}

		@Test
		public void test() {
			assertThat(sut.isEven(2), is(true));
		}
	}

	public static class 値が1の場合のテスト {
		private NumberUtils sut;

		@Before
		public void before() throws Exception {
			sut = new NumberUtils();
		}

		@Test
		public void test() {
			assertThat(sut.isEven(1), is(false));
		}
	}

	public static class 値が0の場合のテスト {
		private NumberUtils sut;

		@Before
		public void before() throws Exception {
			sut = new NumberUtils();
		}

		@Test
		public void test() {
			assertThat(sut.isEven(0), is(true));
		}
	}
}
