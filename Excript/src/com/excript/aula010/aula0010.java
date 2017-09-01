package com.excript.aula010;

import java.util.Scanner;

public class aula0010 {
	public static void main(String[] args){
		
		int num;
		System.out.print("Digite o numero 1!");
		
		Scanner in = new Scanner(System.in);
		
		num= in.nextInt();
		
		//se(num == 10){executa nas chaves}
		if(num==1){
			System.out.println("Obrigado por digitar o um");
		}else{
			System.out.println("O número digitado não é igual a um!");
		in.close();
		}
	}

}
