import java.util.Scanner;

public class Media {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o inteiro n:");
		int n = Integer.parseInt(leitor.nextLine());
		double soma = 0;
		for (int k=0; k<n;k++){
			System.out.println("Digite a próxima nota:");
			double nota = Double.parseDouble(leitor.nextLine());
			soma+=nota;			
		}
		double media = soma/n;
		System.out.printf("Média: %.1f", media);
		leitor.close();
	}
}
