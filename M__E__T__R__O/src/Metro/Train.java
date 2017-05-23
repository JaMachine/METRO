package Metro;

import java.util.ArrayList;

public class Train {
	private static int id = 0;
	private int trainId;

	ArrayList<Wagon> train = new ArrayList<>();

	public Train() {
		id++;
		trainId = id;

		train.add(new Wagon(true));
		train.add(new Wagon(true));
		for (int i = 0; i < 3; i++)
			train.add(new Wagon(false));
	}

	public ArrayList<Wagon> getTrain() {
		return train;
	}

	@Override
	public String toString() {
		return "Train [train=" + train + "]";
	}

	public int getTrainId() {
		return trainId;
	}

}
