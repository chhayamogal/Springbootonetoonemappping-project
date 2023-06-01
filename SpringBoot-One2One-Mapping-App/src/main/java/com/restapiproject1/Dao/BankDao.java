package com.restapiproject1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapiproject1.model.Bank;

@Repository
public interface BankDao extends JpaRepository<Bank, Integer> {

}
