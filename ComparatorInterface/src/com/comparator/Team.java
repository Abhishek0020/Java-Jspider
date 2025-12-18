package com.comparator;

public class Team {
	String name;
	int point;
	int ranks;
	
	public Team(String name,int point,int ranks) {
		this.name=name;
		this.point=point;
		this.ranks=ranks;
		
	}
	public String toString() {
		return "[name"+name+",points = "+point+",ranks : "+ranks+"]";
	}
}
