package com.stefanini.cursojavabasico.matriz;

public class Matriz {
     public static void main(String[] args) {
		double [][] notasAlunos = new double [3][4];
		
		// Nota do aluno 1
		notasAlunos [0][0] = 10;
		notasAlunos [0][1] = 7;
		notasAlunos [0][2] = 8;
		notasAlunos [0][3] = 9.5;
		
		// Nota do aluno 2
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		// Nota do aluno 3
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			//System.out.println(notasAlunos[i]);
			  for ( int j = 0; j < notasAlunos[i].length; j++) {
				  System.out.print(notasAlunos[i][j] + " - ");
			  }
			System.out.println();
		}
		// Mudando a nota 4 do Segundo aluno
	    notasAlunos[1][3] = 8;
	    System.out.println();
	    
	    /*for (int i = 0; i < notasAlunos.length; i++) {
			//System.out.println(notasAlunos[i]);
			  for ( int j = 0; j < notasAlunos[i].length; j++) {
				  System.out.print(notasAlunos[i][j] + " - ");
			  }*/
			System.out.println();
			
			System.out.println("Calculando a média dos Alunos");
			
			double soma;
			
			 for (int i = 0; i < notasAlunos.length; i++) {
					
		              soma = 0;		 
					  for ( int j = 0; j < notasAlunos[i].length; j++) {
						  soma += notasAlunos[i][j];
					  }
					  System.out.println("Média do Aluno " + i + " é = " + (soma / 4));
		
	}
   }
 }
//}
