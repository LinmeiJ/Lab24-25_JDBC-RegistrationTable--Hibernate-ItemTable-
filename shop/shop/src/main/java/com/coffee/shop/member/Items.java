package com.coffee.shop.member;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_items", query=" select item from Items item")
public class Items {
	
	
	
	private String name;
	private String description;
	private Integer quantity;
	private Double price;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private byte[] image;
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Items(String name, String description, Integer quantity, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public Items(String name, String description, Integer quantity, Double price, Integer id) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Items [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price
				+ ", id=" + id + ", image=" + Arrays.toString(image) + "]";
	}

	public Items(String name, String description, Integer quantity, Double price, Integer id, byte[] image) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.id = id;
		this.image = image;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
