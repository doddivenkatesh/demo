package com.demo.api.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.api.dao.entity.CustmerModel;
@Repository("custmerDao")
public interface CustmerDao extends JpaRepository<CustmerModel,Long> {

}
