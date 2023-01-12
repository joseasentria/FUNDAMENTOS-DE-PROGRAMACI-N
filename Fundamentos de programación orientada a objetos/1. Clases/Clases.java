package com.fundamentos;

public class Lampara {
 
	private String color;
	private boolean encendida;
 
	public Lampara(String color) {
		this.color = color;
	}
	public Lampara() {
		this("Roja");
	}
 
}
 
class LamparaCreator {
	public static void main(String[] args) {
 
		Lampara lampara = new Lampara();
 
	}
}