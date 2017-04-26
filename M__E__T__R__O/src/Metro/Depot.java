package Metro;

import java.util.ArrayList;

public class Depot {
	ArrayList<Train> gLine = new ArrayList();



	public void startTrain() {

		gLine.add(new Train());

	}

	@Override
	public String toString() {
		return "Depot [ gLine =" + gLine + " ]";
	}

}
