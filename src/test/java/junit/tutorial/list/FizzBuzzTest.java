package junit.tutorial.list;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test16() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertThat(fizzbuzz.createFizzBuzzList(16), IsFizzBuzz.fizzbuzzOf("1", "2", "Fizz", "4",
                "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz",
                "16"));
    }
}
