package Metro;

import java.util.ArrayList;

public class Train {

	ArrayList<Wagon> train;

	public Train() {
		train.add(new Wagon(true));
		train.add(new Wagon(true));
		for (int i = 0; i < 3; i++)
			train.add(new Wagon(false));
	}

	public ArrayList<Wagon> getTrain() {
		return train;
	}

}
