package com.maitrihibernate.HibernatePersistanceLifeCycle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String name;
	private int price;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
