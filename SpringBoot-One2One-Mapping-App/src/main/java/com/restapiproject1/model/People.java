package com.restapiproject1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "people_table")
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
	public People() {
	}
	public People(int id) {
	super();
	this.id = id;
	}
	public People(String firstName, String lastName, Bank bank) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.bank = bank;
	}
	public People(int id, String firstName, String lastName, Bank bank) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.bank = bank;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	public Bank getBank() {
	return bank;
	}
	public void setBank(Bank bank) {
	this.bank = bank;
	}
	@Override
	public String toString() {
	return id + " " + firstName + " " + lastName + " " + bank;
	}

}
