package com.excript.aula028;

import java.util.Scanner;

public class aula0028 {
	public static void main(String[] args){
		
//		Looping Do/While II
		
		Scanner in = new Scanner(System.in);
		
		int x = 0 ;//onde nos vamos armazenar a operação a realizar
		double num1,num2,resultado;
		
			do{
			
			
			num1=num2=resultado=0;
			
			System.out.println("1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			System.out.println("Digite '0' para sair ");
	
			System.out.println("Digite o codigo da operação");
	
			x = in.nextInt();
			
			if(x!=0){//verfica se o usuario deseja sair do programa
				System.out.println("Digite o primeiro número");
				num1 = in.nextDouble();
				
				System.out.println("Digite o segundo número");
				num2=in.nextDouble();
				
				if(x==1){//somar
					resultado = num1 + num2;
				}else{
					if(x==2){//subtrair
						resultado = num1 - num2;
					}else{
						if(x==3){//multiplicar
							resultado = num1*num2;
						}else{
							if(x==4){//dividir
								resultado=num1/num2;
							}	
						}
					}
				}
				System.out.println();
				System.out.println("resultado é: "+resultado);
				System.out.println("------------------");
				System.out.println();
}
	}while(x!=0);
  }
}
