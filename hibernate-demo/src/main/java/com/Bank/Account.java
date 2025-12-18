package com.Bank;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Account {
    @Id
    private int acid;
    private String acname;
    private int balance;
    
    
    
	public Account(int acid, String acname, int balance) {
		super();
		this.acid = acid;
		this.acname = acname;
		this.balance = balance;
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

    // Getters and setters
    
}
