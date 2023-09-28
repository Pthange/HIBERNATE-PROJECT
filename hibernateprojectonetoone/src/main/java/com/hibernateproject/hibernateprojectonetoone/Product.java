package com.hibernateproject.hibernateprojectonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Product") //table name
@Entity(name="Project_details")//naming the entity class
public class Product 
{

	@Id //it will create as primary key
	private int pid;
	private String pname;
	private int price;
	private String Expirary_Date;
	
	//constructors
	public Product(int pid, String pname, int price, String expirary_Date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		Expirary_Date = expirary_Date;
	}
	
	//superclass constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpirary_Date() {
		return Expirary_Date;
	}

	public void setExpirary_Date(String expirary_Date) {
		Expirary_Date = expirary_Date;
	}
	
	

}
