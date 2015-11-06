package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class lslsPrisoner implements Prisoner {
	private int totalPerson,totalCount;

	@Override
	public String getName() {
		return "李爽2015214230";

	}

	@Override
	public void begin(Manager manager, int totalPerson, int totalCount) {
		 this.totalPerson = totalPerson;
	     this.totalCount = totalCount;
		
	}

	@Override
	public int take(int index, int last) {
		
		return ((totalCount-last)/(index+5) + totalCount/totalPerson)/4;
	}

	@Override
	public void result(boolean survived) {
		
		
	}

}
