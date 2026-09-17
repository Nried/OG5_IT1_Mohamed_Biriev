package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

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

public int getMasse() {
	return masse;
}

public void setMasse(int masse) {
	this.masse = masse;
}

public String getTyp() {
	return typ;
}

public void setTyp(String typ) {
	this.typ = typ;
}

private int masse;
private String typ;

public Ladung(double posX, double posY, int masse, String typ) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.masse = masse;
		this.typ = typ;
	}

	// Methoden

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}