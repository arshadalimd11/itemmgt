package com.dxctraining.itemapp.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Table(name="items")
public class Item {

@Id
@GeneratedValue
private int id;
private String name;

public Item(int id, String name) {
		this.id=id;
		this.name=name;
}
	
	public int getid() {
	return id;
}
	public void setid(int id) {
	this.id=id;
}
	public String getname() {
	return name;
}
	public void setname(String name) {
	 this.name=name;
	 
	}
@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(this ==null || !(obj instanceof Item)) {
			return false;
		}
		Item item=(Item) obj;
		return id == item.id;
		
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	

	
}