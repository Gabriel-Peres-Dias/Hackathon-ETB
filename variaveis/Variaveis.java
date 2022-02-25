package com.stefanini.cursojavabasico.variaveis;

public class Variaveis {

	public static void main(String[] args) {
		byte numByte = 127; // -128 a 127 (8 bits)
		short numShort = 12321; // -32768 a 32767 ( 16 bits)
		int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647 (32 bits)
		long numLong = 897997888; // -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64 bits)
		
		float numFLoat = 10.000f; // -1,14024E-37 a 3.40282347E+38 (32 bits)
		double numDouble = 100000000000000.00; // -4,94E-307 a 1.79769313486231570E+308 (64 bits)
		
		char varChar = 'F'; // 0 65535 (16 bits)
		
		boolean varBoolean = true; //true or false (1 bit)
		
		
		String texto = "Bem-Vindos Devs!";
		Integer numeroConta = 4000;
		Long numeroLongo = 1321312L;
		
		 // Toda variavél deve começar com letra minuscula. Exemplo: nome
		// Não deve começar com caracteres especiais como & ( e comercial), $ (dólar), _ (sublinhado). Exemplo: _nome
		// Se o nome for composto por mais de uma palavra, inicie-se a primeira palavra com a letra minuscula seguida por uma letra maiúscula. Exemplo: nomeCompleto
		// Evitar usar variavel com um carectere apenas. EX: a
	}
}
