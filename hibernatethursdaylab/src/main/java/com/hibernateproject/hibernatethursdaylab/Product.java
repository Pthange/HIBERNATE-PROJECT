package com.hibernateproject.hibernatethursdaylab;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	//adding one to many connection
		@OneToMany(mappedBy="proj")
		private List<Customer>cus;
	
		//constructors
		public Product(int pid, String pname, int price, String expirary_Date, List<Customer> cus) 
		{
			super();
			this.pid = pid;
			this.pname = pname;
			this.price = price;
			Expirary_Date = expirary_Date;
			this.cus = cus;
		}
		
		//superclass constructor
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		//generate getter and setter
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

		public List<Customer> getCus() {
			return cus;
		}

		public void setCus(List<Customer> cus) {
			this.cus = cus;
		}
	

}
