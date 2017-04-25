package Metro;

public class Station {

	private String name;
	private int id;
	private long cash = 0;

	public long getCash() {
		return cash;
	}

	public void setCash(long cashbox) {
		this.cash = cashbox;
	}

	public Station(String name, int id) {
		this.name = name;
		this.id = id;

	}

	@Override
	public String toString() {
		return "Station [name=" + name + ", id=" + id + ", cash=" + cash + "]";
	}

}
