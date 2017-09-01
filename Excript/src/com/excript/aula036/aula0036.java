package com.excript.aula036;

import java.util.Scanner;

public class aula0036 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu dia da semana predileto?");
		System.out.println("Digite 1 para segunda e 7 para domingo");
		int num = in.nextInt();
	
		String dia; 
			switch(num){
			case 1: dia="segunda";
			case 2: dia="terça";
			case 3: dia="quarta";
			case 4: dia="quinta";
			case 5: dia="sexta";
			case 6: dia="sabado";
			case 7: dia="domingo";
			default:dia="Dia inválido";
			
			}
		System.out.println("O dia escolhido foi "+dia);
						
		
	}
}
