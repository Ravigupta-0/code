package com.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Spring.entity.MsgEntity;

@Component
public interface MsgRepo extends JpaRepository<MsgEntity, Long> {

}