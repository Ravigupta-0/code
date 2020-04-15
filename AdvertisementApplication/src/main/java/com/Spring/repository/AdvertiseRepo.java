package com.Spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.Spring.entity.AdvertisementEntity;

@Component
public interface AdvertiseRepo extends JpaRepository<AdvertisementEntity, Long> {
	List<AdvertisementEntity> findByName(String name);
	AdvertisementEntity findByPostId(String postId);
	void deleteByPostId(String postId);
}
