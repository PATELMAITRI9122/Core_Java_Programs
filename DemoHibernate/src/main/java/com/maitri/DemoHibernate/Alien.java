package com.maitri.DemoHibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Columns;

import javafx.print.Collation;

// POJO Class -> Bin Class
@Entity()

public class Alien {

	@Id
	private int aid;
	private String aname;

	@OneToMany(mappedBy = "alien")
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}

	/*
	 * @Id private int aid; private Alien_Name aname; private String color;
	 * 
	 * public int getAid() { return aid; }
	 * 
	 * public void setAid(int aid) { this.aid = aid; }
	 * 
	 * public Alien_Name getAname() { return aname; }
	 * 
	 * public void setAname(Alien_Name aname) { this.aname = aname; }
	 * 
	 * public String getColor() { return color; }
	 * 
	 * public void setColor(String color) { this.color = color; }
	 * 
	 * @Override public String toString() { return "Alien [aid=" + aid + ", aname="
	 * + aname + ", color=" + color + "]"; }
	 * 
	 */

}
