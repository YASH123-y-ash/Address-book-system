package com.addressbooksystem;

/*
 program to create Address Book with person's details
 like first_Name,last_Name,city,state,zip,phoneNumber
 */
import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("person details");
		Person person = new Person("yash", "wardhan", "banglore", "karnataka" , "btm 2nd stage", "wardh@gmail.com", 45637, 88252245);
		person.showPersonsDetails();
	}
}
