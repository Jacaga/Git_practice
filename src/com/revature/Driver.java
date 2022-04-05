package com.revature;
import java.util.*;

import com.revature.model.*;

public class Driver {

	public static void main(String[] args) {
		
		Cupcake[]  ccs= {new Cupcake("berry", "sweet C's", (byte) 5),
				new Cupcake("birthday cake", "sweet C's", (byte) 4), 
				new Cupcake("choco", "sweet C's", (byte) 3), 
				new Cupcake("vanilla", "sweet C's", (byte) 3)};
		
		System.out.println("Welcome to sweet C's");
		System.out.println("1) View Cupcakes \n2) About sweet C's");
		System.out.println("Select 1 or 2: ");
		
		Scanner sc = new Scanner(System.in);
		int userSelection = sc.nextInt();
		sc.nextLine();
		
		if (userSelection==1) {
			for (Cupcake i:ccs) {
			System.out.println(i);
			} 
		}else {
			System.out.println("Sweet C's was establish in 2022 "
					+ "We are family owned");
		}
		
		
		
		
	}
			
}

