package view;

import controller.ThreadRace;

public class principal {

	public static void main(String[] args) {
		int raceDistance = 10;
		
		for(int i = 0; i < 5; i++) {
			ThreadRace tr = new ThreadRace(raceDistance, i);
			tr.start();
		}
	}
}
