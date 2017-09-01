package com.excript.aula009;

import java.util.Scanner;

public class aula0009 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double num1, num2, soma, subtracao,multi,divi;
		
		System.out.println("Insira um número: ");
		num1 = in.nextDouble();
		System.out.println("Insira outro número");
		num2 = in.nextDouble();
		
		soma = num1+num2;
		System.out.println("o resultado da soma é: "+soma);
		
		subtracao = num1 - num2;
		System.out.println("o resultado da subtração é: "+subtracao);

		multi = num1 * num2;
		System.out.println("o resultado da multiplicao é: "+multi);
				
		divi  = num1 / num2;
		System.out.println("o resultado da divisão é: "+divi);

	}

}
