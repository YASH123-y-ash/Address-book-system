package com.addressbooksystem;

/*
 program to create Address Book with person's details
 like first_Name,last_Name,city,state,zip,phoneNumber
 */
import java.util.*;

public class AddressBookMain {

	public void addNewPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Name");
		String firstName = scanner.nextLine();
		System.out.println("Last Name");
		String lastName = scanner.nextLine();
		System.out.println("address");
		String address = scanner.nextLine();
		System.out.println("State");
		String state = scanner.nextLine();
		System.out.println("City");
		String city = scanner.nextLine();
		System.out.println("Zip");
		int zipCode = scanner.nextInt();
		System.out.println("Phone Number");
		long phoneNumber = scanner.nextLong();
		System.out.println("Email");
		String email = scanner.next();

		Person person = new Person( firstName, lastName , city,  state,  address,  email,  zipCode, phoneNumber);
		person.showPersonsDetails();
		System.out.println("new person details added");
	}


	public static void main(String args[]) {

		AddressBookMain addressBook = new AddressBookMain();
		addressBook.addNewPerson();

	}
}

