package com.hibernateproject.hibernateprojectonetoone;

//importing packages
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer_Detail") //naming the entity class
@Table(name="Customer") //table name
public class Customer 
{
	@Id//primary key
	private int cid;
	private String cname;
	private String city;
	private String contact_number;
	
	@OneToOne
	@JoinColumn(name="product_id")
	private Product proj;  //foregin key
	
	//constructors
	public Customer(int cid, String cname, String city, String contact_number, Product proj) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
		this.contact_number = contact_number;
		this.proj = proj;
	}
	
	//superclass constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter and setter
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public Product getProj() {
		return proj;
	}

	public void setProj(Product proj) {
		this.proj = proj;
	}

}	