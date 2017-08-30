import java.util.Scanner;

public class URi1001 {
	public static void main(String [] args){
		Scanner leitor = new Scanner(System.in);
		int a=Integer.parseInt(leitor.nextLine());
		int b=Integer.parseInt(leitor.nextLine());
		int x=a+b;
		System.out.printf("X =%d\n",x);
		leitor.close();
	}	

}
