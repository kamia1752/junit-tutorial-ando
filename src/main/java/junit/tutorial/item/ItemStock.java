package junit.tutorial.item;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {
	private List<Item> itemlist = new ArrayList();

	public void add(String string, int i) {
		// TODO Auto-generated method stub
		Item item = new Item(string, i);
		itemlist.add(item);
	}

	public int count() {
		// TODO Auto-generated method stub
		return itemlist.size();
	}

}
