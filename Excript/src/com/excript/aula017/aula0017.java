package com.excript.aula017;

import java.util.Scanner;

public class aula0017 {
	public static void main(String[] args){
		//Introdução ao operadores lógicos
		
		int iJ,iI;
		iJ=17;
		iI=60;
		
		//mais 17 e menos 60
		
		System.out.println("Digite a idade da pessoa:");
		Scanner in = new Scanner(System.in);
		
		int idade = in.nextInt();
		
		if(idade <=iJ){
			System.out.println("A idade é de uma pessoa jovem");
		}else{
			if(idade >=iI){
				System.out.println("A idade de uma pessoa idosa");
			}else{
				//Se a idade > do que 17 EEE menor do que 60 anos 
				//então a condição é verdadeira
				if((idade >iJ)&&(idade < iI)){
					System.out.println("É uma pessoa de meia idade");
		}
	  }
	}
  }
}