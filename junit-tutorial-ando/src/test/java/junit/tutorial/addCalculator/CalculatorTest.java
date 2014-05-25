package junit.tutorial.addCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test(expected = IllegalArgumentException.class)
	public void divideを用いて6を0で割るテスト() {
		int x = 6;
		int y = 0;
		Calculator cal = new Calculator();
		cal.divide(x, y);
	}

	@Test
	public void divideを用いて6を3で割るテスト() throws Exception {
		int x = 6;
		int y = 3;
		Calculator cal = new Calculator();
		assertThat(cal.divide(x, y), is(2));
	}
}
