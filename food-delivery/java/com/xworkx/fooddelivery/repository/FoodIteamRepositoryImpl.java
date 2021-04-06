package com.xworkx.fooddelivery.repository;

import com.xworkx.fooddelivery.entity.FoodIteamEntity;

public class FoodIteamRepositoryImpl implements FoodIteamRepository {
	
	public FoodIteamRepositoryImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void save(FoodIteamEntity entity) {
		System.out.println("invoked save in FoodIteamRepositoryImpl");
		
		
	}

}
