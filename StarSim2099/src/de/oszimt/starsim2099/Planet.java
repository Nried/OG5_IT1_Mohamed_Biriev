package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Himmelskoerper {

	// Attribute
private int anzahlHafen;
public int getAnzahlHafen() {
	return anzahlHafen;
}





public void setAnzahlHafen(int anzahlHafen) {
	this.anzahlHafen = anzahlHafen;
}





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











private double posX;
private double posY;

public Planet(int anzahlHafen, double posX, double posY, String name) {
	super();
	this.anzahlHafen = anzahlHafen;
	this.posX = posX;
	this.posY = posY;

}





	// Methoden

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
