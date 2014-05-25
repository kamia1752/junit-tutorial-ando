// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static junit.tutorial.BookStoreTestHelper.Bookオブジェクトの作成_MartinFowlerのRefactoring;

public class CalculatorTest {

    @Test
    public void multiplyで3と4の乗算結果が取得できること() throws Exception{
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    public void getTotalPrice() throws Exception {
        // SetUp
        Book book = Bookオブジェクトの作成_MartinFowlerのRefactoring();
        BookStore sut = new BookStore();
        sut.addToCart(book, 1);
        // Exerise & Verify
        assertThat(sut.getTotalPrice(), is(4500));

    }
}
