package com.comparator;

import java.util.Arrays;

public class IPL {
	public static void main(String[] args) {
		Team t1=new Team("Rcb", 6, 3);
		Team t2=new Team("csk", 2, 9);
		Team t3=new Team("DC", 8, 2);
		Team t4=new Team("srh", 2, 10);
		
		Team[] t= {t1,t2,t3,t4};
		Arrays.sort(t,new SortbyRank());
		System.out.println("sort by ranks are : =");
		for(Team team:t) {
			System.out.println(team);
		}
		System.out.println("=========================");
		System.out.println("sort by points are : ");
		Arrays.sort(t,new SortbyPoint());
		for(Team team:t) {
			System.out.println(team);
		}
		
	}

}
