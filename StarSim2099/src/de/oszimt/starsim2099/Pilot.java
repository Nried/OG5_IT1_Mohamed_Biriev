package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	// Attribute

	private String grad;

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double posY;
	private double posX;
	private String name;

	// Methoden

	public Pilot(String name, String grad, double posY, double posX) {
		super();
		this.name = name;
		this.grad = grad;
		this.posY = posY;
		this.posX = posX;
	}

}
