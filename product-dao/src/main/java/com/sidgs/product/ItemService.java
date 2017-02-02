package com.sidgs.product;


import com.sidgs.product.model.Item;

import java.util.Set;

public interface ItemService {
	
	void add(Item item);
	Set<Item> getItems();
	Item getItem(Number itemId);
	void changePrice(Float price, Number itemId);
	void changeQty(Number quantity, Number itemId);
}
