package com.stefanini.cursojavabasico.operadores;

public class Logico {

	public static void main(String[] args) {
		/**
		 AND
		 V and V => V
		 V and F => F
		 F and V => F
		 F and F => F
		 
		 OR 
		 V or V => V
		 V or F => V
		 F or V => V
		 F or F => F
		 
		 XOR
		 V xor V => F
		 V xor F => V
		 F xor V => V
		 F xor F => F
		 
		 Negacao
		 !V => F
		 !F => V
		
		*/
		
		 // &&
		System.out.println(true&&true);
		
		// || 
		System.out.println(false || false);
		
		// !=
		System.out.println(true != false);
		
		// !
		System.out.println(!false);
	}
}
