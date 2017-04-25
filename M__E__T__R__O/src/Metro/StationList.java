package Metro;

import java.util.ArrayList;

public class StationList {



	static ArrayList gStat = new ArrayList();

	public static ArrayList getgStat() {
		return gStat;
	}

	public static void startStations() {

		Station s = new Station(" STA 000", 77);
		gStat.add(s);
		gStat.add(new Station(" STA 001", 56));
		gStat.add(new Station(" STA 002", 76));

		System.out.println("\n    =(O . O)=           Stations loaded  ! ! !\n\n");

	}

}
