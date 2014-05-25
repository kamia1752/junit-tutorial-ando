package junit.tutorial.snakecase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void aaaの場合() {
		assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
	}

	@Test
	public void HelloWorldの場合() {
		assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
	}
	
	@Test
	public void practiceJunitの場合() {
		assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
	}
}
