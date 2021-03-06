package com.capstone.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.demo.model.SavingsTransfers;

@Repository
public interface SavingsTransfersDAO extends JpaRepository<SavingsTransfers, Integer>{
	
	List<SavingsTransfers> findAll();

}
