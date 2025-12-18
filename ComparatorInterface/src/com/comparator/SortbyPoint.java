package com.comparator;

import java.util.Comparator;

public class SortbyPoint implements Comparator<Team> {
	


	@Override
	public int compare(Team o1, Team o2) {
		return o1.point-o2.point;
	}

}
