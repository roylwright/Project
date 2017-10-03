package com.business;

import java.util.ArrayList;

import com.business.Transaction;


	public class Account {
		private double balance;
		private double deposit;
		private double withdraw;
		private ArrayList<Transaction> transaction = new ArrayList<>();
	
	public Account() {}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
		this.balance += deposit;
		Transaction t1 = new Transaction();
		t1.setType("deposit");
		t1.setAmount(deposit);
		transaction.add(t1);
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
		this.balance -= withdraw;
		Transaction t1 = new Transaction();
		t1.setType("withdraw");
		t1.setAmount(withdraw);
		transaction.add(t1);
		printTransaction();
	}
	public void printTransaction() {
		for (int i=0; i<transaction.size();i++) {
				System.out.println(transaction.get(i));		
		}
		
	}
	
	public ArrayList<Transaction> getTransaction() {
		return transaction;
	}
	
	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transaction = transaction;
	}

}
