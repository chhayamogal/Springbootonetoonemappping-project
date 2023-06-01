package com.restapiproject1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank_table")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bankName;
	private int phoneNumber;
	public Bank() {
	}
	public Bank(int id) {
	super();
	this.id = id;
	}
	public Bank( String bankName,int phoneNumber) {
	super();
	this.bankName = bankName;
	this.phoneNumber = phoneNumber;
	}
	public Bank(int id, String bankName,int phoneNumber) {
	super();
	this.id = id;
	this.bankName = bankName;
	this.phoneNumber = phoneNumber;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getBankName() {
	return bankName;
	}
	public void setBankName(String bankName) {
	this.bankName = bankName;
	}
	public int getPhoneNumber() {
	return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
	return "Bank [id=" + id + ", bankName=" + bankName + ", phoneNumber=" +
	phoneNumber + "]";
	}

}
