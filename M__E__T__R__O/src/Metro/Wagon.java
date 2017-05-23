package Metro;

import java.util.ArrayList;

public class Wagon {
	private int c; // capacity
	private boolean m; // main wagon
	public ArrayList<Passenger> passInside = new ArrayList<>();
	

	public Wagon(boolean m) {
		this.m = m;
		if (m == true)
			c = 340;
		else
			c = 350;
	}

	@Override
	public String toString() {
		return "Wagon [c=" + c + ", m=" + m + "]";
	}

	public int getC() {
		return c;
	}

	public boolean isMa() {
		return m;
	}

}
