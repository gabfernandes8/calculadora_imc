package br.senai.sp.jandira;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = teclado.next();
		
		System.out.println("Qual é sua altura?");
		double altura = teclado.nextDouble();
		
		System.out.println("Qual seu peso?");
		int peso = teclado.nextInt();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("Olá, "+ nome +"! Seu IMC é "+ imc +".");
		
		

	}

}
