package com.stefanini.cursojavabasico.orientacaoaobjetos;

// FINAL para a classe não ser extendida
public abstract class Carro {
	/*
	 Modificadores de acesso
	 default => não é uma palavra chave ( palavra reservada. Acessível na própria classe ou classe de um mesmo pacote 
	 public  => Acessível própria classe, classe mesmo pacote, subclasses (extends), todas as demais classes
	 private => Acesso apenas na própria classe
	 protected => Acessível própria classe, classe mesmo pacote, subclasses (extends)
	 SHIFT ALT S
	 */

	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitro;
	
	public Carro () {
		System.out.println("Construindo o carro....");
	}
	
	public Carro (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void frear() {
		System.out.println("Freiando...");
	}
	
	public abstract void piscarAlerta ();
	
	
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
	}
	
	//SOBRECARGA PARAMETRO
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0 ) / (tempoFinal - 0 ) * 3.6;
	}
	
	//SOBRECARGA TIPO VARIAVEL
	public String calcularTaxaAceleracao(int velocidadeFinal, int velocidadeInicial, double tempoFinal, double tempoInicial) {
		return " " + (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException {
		if (velocidadeMaxima < 0) {
			throw new NegocioException("Valor não é válido");
		} else {
			this.velocidadeMaxima = velocidadeMaxima;
		}
	}

	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}

	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}

	public void setQuilometrosPorLitro(double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}

	
	

	
	
	
	
}
