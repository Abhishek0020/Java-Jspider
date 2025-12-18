package com.comparator;

import java.util.Comparator;

public class SortbyRank implements Comparator<Team> {
	

	@Override
	public int compare(Team o1, Team o2) {
		return o1.ranks-o2.ranks;
		
	}
}
