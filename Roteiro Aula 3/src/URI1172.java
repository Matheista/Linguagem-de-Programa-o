import java.util.Scanner;

public class URI1172 {
	public static void main(String[] args){
//		Faça um programa que leia um vetor X[10]. 
//		Substitua a seguir, todos os valores nulos 
//		e negativos do vetor X por 1. 
//		Em seguida mostre o vetor X.
//
//		Entrada
//
//		A entrada contém 10 valores inteiros, 
//		podendo ser positivos ou negativos.
//
//		Saída
//
//		Para cada posição do vetor, escreva "X[i] = x", 
//		onde i é a posição do vetor e x é o 
//		valor armazenado naquela posição.
		Scanner in = new Scanner(System.in);
		
		int vetor [] = new int [10];
		
		for (int k=0;k<10;k++){
			int x = Integer.parseInt(in.nextLine());
			if (x<=0){
				vetor[k]=1;
			}else{
				vetor[k]=x;

			}
			
		}
		for (int k =0;k<=10;k++){
			System.out.println("vetor["+k+"]="+vetor[k]);
		}
		in.close();


	}
}