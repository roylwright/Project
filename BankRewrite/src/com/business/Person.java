package com.business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.business.Account;
import com.business.Address;


public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private String password; 
	private Address address = new Address();
	private Account checking = new Account();
	private Account savings = new Account();
	
	public Person() {	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		createFile(email, password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getChecking() {
		return checking;
	}

	public void setChecking(Account checking) {
		this.checking = checking;
	}

	public Account getSavings() {
		return savings;
	}

	public void setSavings(Account savings) {
		this.savings = savings;
	}
	public static void createFile(String email, String password) {	
		String[] emails = email.split("\\.");		
		String path = "/Users/Roy/Desktop/TestPrintFiles/"+emails[0]+ ".txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write(password);
			bw.close();
		} catch (IOException e) {
			System.out.println("Error writing to file");
		}
	}
}
