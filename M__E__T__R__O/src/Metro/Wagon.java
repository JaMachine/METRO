package Metro;

public class Wagon {
	private int ca; // capacity

	private boolean ma; // main wagon

	public Wagon(boolean ma) {
		if (ma == true)
			ca = 340;
		else
			ca = 350;
		this.ma = ma;
	}

	public int getCa() {
		return ca;
	}

	public boolean isMa() {
		return ma;
	}

	// <Integer> void startWagon() {
	// Wagon w = new Wagon();
	//
	// }

}
