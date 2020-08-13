package com.dxctraining.itemapp.dao;
import com.dxctraining.itemapp.entities.Item;
import javax.persistence.Entity;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import com.dxctraining.itemapp.exceptions.*;
import org.springframework.stereotype.Repository;

@Repository
public class ItemdaoImpl implements Itemdao {
@PersistenceContext
private EntityManager entityManager;

@Override
public Item findItem(int item) {
	Item item =entitymanager.find(Item.class,id);
	
	if(item==null) {
		throw new ItemNotFoundException("Item not found");
		
	}
	
	@Override
	public void removeItem(int id) {
		
		Item item =entitymanager.find(Item.class,id);
		entitymanager.remove(id);
	}
	
	@Override
	public Item update(Item item) {
		item=entitymanager.merge(item);
		return item;
	}
}

