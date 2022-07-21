package org.bike;

public class Ktm implements Bike {

	@Override
	public void speed() {	
		System.out.println("Ktm 150 speed Per hor");
	}

	@Override
	public void cost() {
		System.out.println("Ktm cost is = 2.5 laks");	
	}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.cost();k.speed();
}
}
