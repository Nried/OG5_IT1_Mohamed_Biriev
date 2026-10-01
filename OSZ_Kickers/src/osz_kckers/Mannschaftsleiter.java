package osz_kckers;

public class Mannschaftsleiter extends Spieler {

	private String mannschaftsname;
	private String Rabbat;
	private boolean kannOrganisieren;

	public String getMannschaftsname() {
		return mannschaftsname;
	}

	public void setMannschaftsname(String mannschaftsname) {
		this.mannschaftsname = mannschaftsname;
	}

	public String getRabbat() {
		return Rabbat;
	}

	public void setRabbat(String rabbat) {
		Rabbat = rabbat;
	}

	public boolean isKannOrganisieren() {
		return kannOrganisieren;
	}

	public void setKannOrganisieren(boolean kannOrganisieren) {
		this.kannOrganisieren = kannOrganisieren;
	}

}
