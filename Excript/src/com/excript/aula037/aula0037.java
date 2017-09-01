package com.excript.aula037;

public class aula0037 {
	public static void main(String[] args){
		
		labelForI: for (int i=0;i<10;i++){
			
			for(int j=0;j<10;j++){
				System.out.println("o valor de i = "+i+" o valor de j é:"+j);
				if(j==6 && i==0)
					break labelForI;
			}
			
			int a=0;
			labelWhile: while(a<10){
				a++;
				if(a==5)
					break labelForI;
			}
			
		}
		
	}

}
