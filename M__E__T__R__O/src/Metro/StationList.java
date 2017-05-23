package Metro;

import java.util.ArrayList;

public class StationList {

	ArrayList<Station> gStat = new ArrayList<>();
	ArrayList<Station> rStat = new ArrayList<>();

	public static void startStations() {

		Station s = new Station(" STA 000");
		gStat.add(s);
		gStat.add(new Station(" STA 001"));
		gStat.add(new Station("STA 002"));
		gStat.add(new Station("STA 003"));
		gStat.add(new Station("STA 004"));

		rStat.add(new Station(" STA 005"));
		rStat.add(new Station("STA 006"));
		rStat.add(new Station("STA 007"));
		rStat.add(new Station("STA 008"));

		System.out.println("\n    =(O . O)=           Stations loaded  ! ! !\n//  StationList.getgStat().get(0)\n");

	}

	public ArrayList<Station> getgStat() {
		return gStat;
	}

}
