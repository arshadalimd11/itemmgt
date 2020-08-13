package com.dxctraining.itemapp.dao;
import com.dxctraining.itemapp.entities.Item;

public interface Itemdao {
	
	public Item findItem(int id);
	public Item update(Item item);
	public void removeItem(int id);
	
}
