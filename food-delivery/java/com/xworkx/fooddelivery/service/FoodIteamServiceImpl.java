package com.xworkx.fooddelivery.service;

import com.xworkx.fooddelivery.entity.FoodIteamEntity;
import com.xworkx.fooddelivery.repository.FoodIteamRepository;

public class FoodIteamServiceImpl implements FoodIteamService {
	private FoodIteamRepository foodIteamRepo;

	public FoodIteamServiceImpl(FoodIteamRepository foodIteamRepo) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.foodIteamRepo = foodIteamRepo;
	}

	@Override
	public boolean validateAndSave(FoodIteamEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			foodIteamRepo.save(entity);

		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
