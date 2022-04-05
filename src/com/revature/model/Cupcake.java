package com.revature.model;

import java.util.Scanner;

/**
 * 
 * @author Jaeden Garcia
 *
 */

public class Cupcake {
	String flavor;
	String bakery;
	byte cost;
	/**
	 * 
	 * @param flavor: 
	 * @param bakery
	 * @param cost
	 */
	public Cupcake(String flavor, String bakery, byte cost) {
		this.flavor = flavor;
		this.bakery = bakery;
		Scanner sc = new Scanner(System.in);
			while (cost<=2) {
				System.out.println("the price is too low, increase the price");
				cost = sc.nextByte();
			}
		this.cost = cost;
	}
	
	public void tasty() {
		System.out.println("I taste like "+ flavor);
	}
	
	public void whereBaked() {
		System.out.println("It was made at "+ bakery);
	}
	
	public void price() {
		System.out.println("It cost me "+ cost + " dollars");
	}
	
	public void about() {
		tasty();
		whereBaked();
		price();
	}

	@Override
	public String toString() {
		return "Cupcake [flavor=" + flavor + ", bakery=" + bakery + ", cost=" + cost + "]";
	}
	
}
