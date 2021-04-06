package com.xworkx.fooddelivery;

import com.xworkx.fooddelivery.entity.FoodIteamEntity;
import com.xworkx.fooddelivery.repository.FoodIteamRepository;
import com.xworkx.fooddelivery.repository.FoodIteamRepositoryImpl;
import com.xworkx.fooddelivery.service.FoodIteamService;
import com.xworkx.fooddelivery.service.FoodIteamServiceImpl;

public class DeliveryTester {
	public static void main(String[] args) {
		FoodIteamEntity entity=new FoodIteamEntity("veg briyani", 10.7, 80, 01, FoodType.CHINISE);
		FoodIteamRepository foodIteamRepository=new FoodIteamRepositoryImpl();
		FoodIteamService foodIteamService=new FoodIteamServiceImpl(foodIteamRepository);
		foodIteamService.validateAndSave(entity);
	}

}
