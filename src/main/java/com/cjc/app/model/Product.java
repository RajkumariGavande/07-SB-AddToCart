package com.cjc.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Table(name = "PRODUCT_DTLS")
@DynamicUpdate
@Entity
public class Product {
	private int z = 1000;

	private String names = "Ronit";

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private String color;
	private String brand;
	private double price;

	public int getPid() {
		return pid;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String color, String brand, double price) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", color=" + color + ", brand=" + brand + ", price=" + price
				+ "]";
	}

}
