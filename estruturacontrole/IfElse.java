package com.stefanini.cursojavabasico.estruturacontrole;

public class IfElse {
        public static void main(String[] args) {
	
        	int idade = 18;
        	
        	if (idade >= 18) {
        		System.out.println("Maior de Idade");
        	}
        	
        	//
        	
        	if (idade >= 18) {
        		System.out.println("Maior de Idade");
        	}
        	else {
        		System.out.println("Menor de Idade");
        	}
        	
        	if (idade  >= 100) {
        		System.out.println("Virou uma múmia");
        	}else if (idade  >= 18) {
        	    System.out.println("Maior de Idade");
        	}else {
        		System.out.println("Menor de Idade");
        	}
        	
        	if (idade >= 18) 
                System.out.println("Maior de Idade"); // Sem o bloco executa somente a primeira linha após os parâmetros
        	
        		
        	}
     }

