package Metro;

import java.util.ArrayList;

public class Depot {
	ArrayList gTrains = new ArrayList();

	public void startTrains() {

		gTrains.add(new Wagon(true));

	}

}
