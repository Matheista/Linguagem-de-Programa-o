import java.util.Scanner;

public class MultiploDeN {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor de n");
		int n = Integer.parseInt(leitor.nextLine());
		for(int k=1; k<=100;k++){
			if (k%n == 0){
				System.out.println(k);
			}
		}
		leitor.close();
	}
}