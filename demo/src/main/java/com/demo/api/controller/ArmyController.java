package com.demo.api.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.api.dao.entity.ArmyModel;
import com.demo.api.service.ArmyService;

@RestController
@RequestMapping("/api/army")
public class ArmyController {

	@Resource(name="armyService")
	private ArmyService armyService;
	
	@PostMapping("/create")
	public ArmyModel create(@RequestBody ArmyModel armyModel) {
		ArmyModel ArmyM= armyService.save(armyModel);
		return ArmyM;
		
	}
}
