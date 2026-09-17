package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	private double posX, posY;
	public double getPosX() {
		return posX;
	}



	public void setPosX(double posX) {
		this.posX = posX;
	}



	public double getPosY() {
		return posY;
	}



	public void setPosY(double posY) {
		this.posY = posY;
	}



	public int getMaxKapazität() {
		return maxKapazität;
	}



	public void setMaxKapazität(int maxKapazität) {
		this.maxKapazität = maxKapazität;
	}



	public int getWinkel() {
		return winkel;
	}



	public void setWinkel(int winkel) {
		this.winkel = winkel;
	}



	public String getAntrieb() {
		return antrieb;
	}



	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}



	public String getTyp() {
		return typ;
	}



	public void setTyp(String typ) {
		this.typ = typ;
	}



	private int maxKapazität, winkel;
	private String antrieb, typ;
	
	
	public Raumschiff(double posX, double posY, int maxKapazität, int winkel, String antrieb, String typ) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.maxKapazität = maxKapazität;
		this.winkel = winkel;
		this.antrieb = antrieb;
		this.typ = typ;
	}



	// Methoden

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}



	public void setMaxKapazität1(int maxKapazitaet) {
		// TODO Auto-generated method stub
		
	}



	public int getMaxLadekapazitaet() {
		// TODO Auto-generated method stub
		return 0;
	}



	public void setMaxLadekapazitaet(int i) {
		// TODO Auto-generated method stub
		
	}

}
