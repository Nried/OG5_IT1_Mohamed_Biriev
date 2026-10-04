package omnom;

public class Haustier {

	private int hunger;
	private int muede;
	private int zufrieden;
	private int gesund;
	private String name;

	public Haustier() {
		hunger = 100;
		muede = 100;
		zufrieden = 100;
		gesund = 100;
		name = "";
	}

	public Haustier(String name) {
		hunger = 100;
		muede = 100;
		zufrieden = 100;
		gesund = 100;
		this.name = name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getMuede() {
		return muede;
	}

	public int getZufrieden() {
		return zufrieden;
	}

	public int getGesund() {
		return gesund;
	}

	public String getName() {
		return name;
	}

	public void setHunger(int hunger) {
		if (hunger >= 0 && hunger <= 100) {
			this.hunger = hunger;
		}
	}

	public void setMuede(int muede) {
		if (muede >= 0 && muede <= 100) {
			this.muede = muede;
		}
	}

	public void setZufrieden(int zufrieden) {
		if (zufrieden >= 0 && zufrieden <= 100) {
			this.zufrieden = zufrieden;
		}
	}

	public void setGesund(int gesund) {
		if (gesund >= 0 && gesund <= 100) {
			this.gesund = gesund;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fuettern(int anzahl) {
		setHunger(hunger + anzahl);
	}

	public void schlafen(int dauer) {
		setMuede(muede + dauer);
	}

	public void spielen(int dauer) {
		setZufrieden(zufrieden + dauer);
	}

	public void heilen() {
		setGesund(100);
	}
}
