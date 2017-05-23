package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

import Metro.*;

public class Main {
	public static void main(String[] args) {

		ArrayList<Train> trains = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			trains.add(new Train());
		}
		Comparator<Driver> copmarator = new Comparator<Driver>() {

			@Override
			public int compare(Driver o1, Driver o2) {
				if (o1.getExp() > o2.getExp()) {
					return -1;
				}
				if (o1.getExp() < o2.getExp()) {
					return 1;
				}
				return 0;
			}

		};
		PriorityQueue<Driver> drivers = new PriorityQueue<>(copmarator);

		for (int i = 0; i < 5; i++) {
			drivers.add(new Driver());
		}
		System.out.println(drivers);

		for (Train t : trains) {
			Driver d = drivers.poll();
			System.out.println("driver " + d + " on train " + t);
			d.minExp();
			drivers.add(d);

		}
		System.out.println(drivers);

		Line greenLine = new Line();
		Line redLine = new Line();
		Line blueLine = new Line();

		for (int i = 0; i < 10; i++) {
			greenLine.stations.add(new Station("green" + i));
			redLine.stations.add(new Station("red" + i));
			blueLine.stations.add(new Station("blue" + i));
			
		}
		
		Iterator<Train> trainIterator = trains.iterator();
		while (trainIterator.hasNext()){
			greenLine.trains.add(trainIterator.next());
			if(trainIterator.hasNext()){
				redLine.trains.add(trainIterator.next());
			}
			if(trainIterator.hasNext()){
				blueLine.trains.add(trainIterator.next());
			}
		}
		
		
		
		
		

		// MySQL.insertInto("insert into stations (name,cash,line)values('Tarasa
		// Shevchenka',0,1)");
		// MySQL.addCash(8, 2);
		// MySQL.getFrom("select * from stations");

		// StationList.startStations();

		// d.toString();
		// d.startTrain();

	}

}