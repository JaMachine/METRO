package Metro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Depot {

	public void startTrains() {
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
	}

	// ArrayList <Wagon>wagons = new ArrayList<>();
	//
	// for(int i = 0; i < 50; i++){
	// wagons.add(new Wagon(false));
	// }
	//
	//
	//
	// /*
	// *
	// * ArrayList<Train> gLine = new ArrayList();
	// *
	// *
	// *
	// * public void startTrain() {
	// *
	// * gLine.add(new Train());
	// *
	// * }
	// *
	// */

}
