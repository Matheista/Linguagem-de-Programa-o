package com.urionline.URI1180;

import java.util.Scanner;

public class URI1180 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero de elementos: ");
		int N = Integer.parseInt(in.nextLine());
		String [] numerosLidos = in.nextLine().split(" ");		int []X = new int [N];
		
		for(int k=0;k<X.length;k++){
			System.out.println("Digite o numero ");
			X[k]=Integer.parseInt(in.nextLine());
			
		}
		int menor = X[0];
		int posicaoMenor = 0;
		for(int k=1;k<N;k++){
			if(X[k]< menor){
				menor=X[k];
				posicaoMenor=k;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+posicaoMenor);
		in.close();
	
		
		
	}

}
