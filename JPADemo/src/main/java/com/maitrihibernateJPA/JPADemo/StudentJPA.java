package com.maitrihibernateJPA.JPADemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentJPA {
	
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
	@Override
	public String toString() {
		return "StudentJPA [lid=" + lid + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
