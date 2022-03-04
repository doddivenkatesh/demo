package com.demo.api.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.api.dao.entity.ArmyModel;
import com.demo.api.dao.repository.ArmyDao;
import com.demo.api.service.ArmyService;

@Service("armyService")
public class ArmyServiceimpl implements ArmyService{

	@Resource(name="armyDao")
	private ArmyDao armyDao;
	
	@Override
	public ArmyModel save(ArmyModel armyModel) {
		// TODO Auto-generated method stub
		return armyDao.save(armyModel);
	}

}


