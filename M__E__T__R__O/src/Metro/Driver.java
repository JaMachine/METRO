package Metro;

import java.util.Random;

public class Driver {

	private int exp;
	private static int id = 0;
	private int driverId;

	public Driver() {
		driverId = id;

		id++;

		int r = (int) ((Math.random() * 2));

		if (r == 0) {
			this.exp = 7 + (int) ((Math.random() * 5));
		} else if (r == 1) {
			this.exp = 17 + (int) ((Math.random() * 5));
		} else {
			this.exp = 27 + (int) ((Math.random() * 5));
		}

	}

	public void minExp() {
		Random r = new Random();

		this.exp += r.nextInt(20) - 15;
		if (exp < 0)
			this.exp = 0;

	}

	public int getExp() {
		return exp;
	}

	public int getDriverId() {
		return driverId;
	}

	@Override
	public String toString() {
		return "Driver [exp=" + exp + ", driverId=" + driverId + "]";
	}

}
