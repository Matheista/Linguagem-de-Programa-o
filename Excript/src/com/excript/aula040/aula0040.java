package com.excript.aula040;

public class aula0040 {
	public static void main(String[] args){
		System.out.println("imprima os numeros pares de 1 até 100");
		//Continue encerra somente um único ciclo
		
		
		System.out.println();
		for (int i=0;i<100;i++){
			if(i%2==0)
				System.out.println(i);
			else
				continue;
			
			int a=0, soma=0;
			
			while(a<i){
				a++;
				soma+=a;
			}
			System.out.println("A soma de todos os numeros é: "+soma);
			}		
	}

}
