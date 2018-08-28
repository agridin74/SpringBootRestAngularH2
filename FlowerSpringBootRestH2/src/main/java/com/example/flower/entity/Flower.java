package com.example.flower.entity;


import javax.persistence.*;


@Entity
@Table(name = "flower")
public class Flower {
	
	/**
	 * 
	 */
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; //Id записи
	
	@Column(name = "name")
	private String name; //Наименование
	
	@Column(name = "price")
	private double price; //Цена
	
	@Column(name = "active")
	private boolean active; //Активная позиция или нет

	public Flower() {
		
	}
	
	public Flower(String name, double price) {
		this.name = name;
		this.price =price;
		this.active = false;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + "]";
	}

	

}
