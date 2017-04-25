package Main;

import Metro.*;

public class Main {
	public static void main(String[] args) {
		
		StationList.startStations();
		
		System.out.println(StationList.getgStat().get(1));
		System.out.println(StationList.getgStat().get(2));
		System.out.println(StationList.getgStat().get(0));
		System.out.println(StationList.getgStat().size());
		
		
		Wagon ma = new Wagon(true);
		Wagon pas = new Wagon(false);
		System.out.println(ma.getCa());
		System.out.println(pas.getCa());
		

	}

}