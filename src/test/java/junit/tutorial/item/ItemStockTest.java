package junit.tutorial.item;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemStockTest {

	private ItemStock sut;
	
	@Before
	public void before() throws Exception {
		sut = new ItemStock();
	}
	@Test
	public void test() {
		sut.add("book", 100);
		assertThat(sut.count(), is(1));
	}

}
