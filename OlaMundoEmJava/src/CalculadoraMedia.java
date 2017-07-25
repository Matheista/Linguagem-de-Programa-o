
public class CalculadoraMedia {
	
	public static void main(String [] args){
		//Imprimindo mensagem de Boas Vindas
		System.out.println("Bem-vindo(a) à Calculadora de Médias");
		//Somando as 3 notas e imprimindo a média
		double nota1 = 9.0;
		double nota2 = 5.8;
		double nota3 = 6.3;
		double media = (nota1+nota2+nota3)/3;
		System.out.println(media);
		if(media >=4 && media < 7){	
		double notaPraPassar = (5 -0.6*media)/0.4;
		System.out.println("Você precisa de "+notaPraPassar);
		}
		
	}
}