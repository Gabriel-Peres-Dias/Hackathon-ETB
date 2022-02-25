package com.stefanini.cursojavabasico.breackcontinue;

public class BreakContinue {
      
	public static void main(String[] args) {
		String[] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model 5"};
		
		for (int i = 0; i < carros.length; i++) {
			if(carros[i] == "BMW i320") {
			System.out.println(carros[i]);
			continue;
			}
			System.out.println("quero esse carro");
			System.out.println(carros[i]);
		
	}
	}
}

