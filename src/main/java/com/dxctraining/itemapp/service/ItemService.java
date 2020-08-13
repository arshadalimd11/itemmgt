package com.dxctraining.itemapp.service;
import com.dxctraining.itemapp.entities.Item;

public interface ItemService {
	
	 public Item findItem(int id);
	    Item update(Item item);
	    void removeItem(int id);	
	
}
