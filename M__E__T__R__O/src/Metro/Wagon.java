package Metro;

public class Wagon {
	private int c; // capacity

	private boolean m; // main wagon

	public Wagon(boolean m) {
		this.m = m;
		if (m == true)
			c = 340;
		else
			c = 350;
	}

	public int getC() {
		return c;
	}

	public boolean isMa() {
		return m;
	}

}
