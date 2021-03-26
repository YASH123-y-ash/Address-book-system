package com.addressbooksystem;

import java.util.*;
import java.io.*;

public class Person{

	// Class-variable declarations
	private String firstName, lastName, city, state, address, email;
	private int zipCode;
	private long phoneNumber;

	public Person(String firstName, String lastName , String city, String state, String address, String email, int zipCode, long phoneNumber){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.address = address;
		this.email = email;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	// Methods for modifying class-variables

	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setemail(String email){
		this.email = email;
	}
	public void setZipCode(int zipCode){
		this.zipCode = zipCode;
	}
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	// Methods for displaying class-variables
	public String getfirstName(){
		return this.firstName;
	}
	public String getlastName(){
		return this.lastName;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public String getAddress(){
		return this.address;
	}
	public String getemail(){
		return this.email;
	}
	public int getZipCode(){
		return this.zipCode;
	}
	public long getPhoneNumber(){
		return this.phoneNumber;
	}
	public void showPersonsDetails(){

		System.out.println("\n+" + new String(new char[54]).replace('\0', '-')+"+");
		System.out.format("| %20s: %30s |\n","First name", this.getfirstName());
		System.out.format("| %20s: %30s |\n","Last  name", this.getlastName());
		System.out.format("| %20s: %30s |\n","Phone Number", this.getPhoneNumber());
		System.out.format("| %20s: %30s |\n","City", this.getCity());
		System.out.format("| %20s: %30s |\n","State", this.getState());
		System.out.format("| %20s: %30s |\n","Address", this.getAddress());
		System.out.format("| %20s: %30s |\n","Address", this.getemail());
		System.out.format("| %20s: %30s |\n","Zip Code", this.getZipCode());
		System.out.println("+" + new String(new char[54]).replace('\0', '-')+"+");
	}
	

}
