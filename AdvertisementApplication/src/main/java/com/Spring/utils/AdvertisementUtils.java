package com.Spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.Spring.Advertisement;
import com.Spring.users;
import com.Spring.entity.AdvertisementEntity;
import com.Spring.entity.UserEntity;

public class AdvertisementUtils {
	
	public static List<Advertisement> convertAdvertiseEntityListToAdvertiseList(List<AdvertisementEntity> advertiseEntityList) {
		List<Advertisement> advertiseList = new ArrayList<Advertisement>();
		Consumer<AdvertisementEntity> consumer = (AdvertisementEntity advertiseEntity)->advertiseList.add(convertAdvertiseEntityToAdvertise(advertiseEntity));
		advertiseEntityList.stream().forEach(consumer);
		return advertiseList;
	}

	public static Advertisement convertAdvertiseEntityToAdvertise(AdvertisementEntity advertisementEntity) {
		return new Advertisement(advertisementEntity.getTitle(),advertisementEntity.getName(),advertisementEntity.getCategory(),advertisementEntity.getDescription(), advertisementEntity.getPostid()
				, advertisementEntity.getStatus());
	}
	public static AdvertisementEntity convertAdvertiseToAdvertiseEntity(Advertisement advertisement) {
		return new AdvertisementEntity(advertisement.getTitle(),advertisement.getName(),advertisement.getCategory(),advertisement.getDescription(),advertisement.getPostId(),
				advertisement.getStatus());
	}
}
