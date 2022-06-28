package com.maitrihibernate.HibernateCaching;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Studen_Details")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class StudentName {
	
	@Id
	private int sId;
	private String sName;
	private String tech;
	
	public int getsId() {
		return sId;
	}
	
	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String getTech() {
		return tech;
	}
	
	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "StudentName [sId=" + sId + ", sName=" + sName + ", tech=" + tech + "]";
	}
	
	
	
	
	

}
