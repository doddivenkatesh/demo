package com.demo.api.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.api.dao.entity.ArmyModel;

@Repository("armyDao")
public interface ArmyDao extends JpaRepository<ArmyModel,Long> {

	
}
