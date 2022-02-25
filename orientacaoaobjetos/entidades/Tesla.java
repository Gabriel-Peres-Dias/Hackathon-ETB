package com.stefanini.cursojavabasico.orientacaoaobjetos.entidades;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;

public class Tesla extends Carro {

	private boolean dirigirSozinho;
	
	public Tesla() { 
		super();
		
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla Sobrescrita");
		return velocidadeFinal * tempoFinal;
	}

	public boolean isDirigirSozinho() {
		return dirigirSozinho;
	}

	public void setDirigirSozinho(boolean dirigirSozinho) {
		this.dirigirSozinho = dirigirSozinho;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("Tesla Piscando Alerta!");
		
	}
}
