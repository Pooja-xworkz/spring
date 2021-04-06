package com.xworkx.fooddelivery.entity;

import com.xworkx.fooddelivery.FoodType;

public class FoodIteamEntity {
	private String name;
	private double discount;
	private int price;
	private int quantiy;
	private FoodType foodType;

	public FoodIteamEntity() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quantiy;
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
		FoodIteamEntity other = (FoodIteamEntity) obj;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantiy != other.quantiy)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantiy() {
		return quantiy;
	}

	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}

	
	public FoodIteamEntity(String name, double discount, int price, int quantiy, FoodType foodType) {
		super();
		this.name = name;
		this.discount = discount;
		this.price = price;
		this.quantiy = quantiy;
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return "FoodIteamEntity [name=" + name + ", discount=" + discount + ", price=" + price + ", quantiy=" + quantiy
				+ "]";
	}

}
