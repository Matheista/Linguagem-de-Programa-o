import javax.swing.JOptionPane;

public class JogoDaAdvinhacao {
	public static void main(String [] args){
		int numProcurado =Integer.parseInt(JOptionPane.showInputDialog("Digite numero procurado entre 0-100"));
		boolean achou = false;
		int pontuacao=100;
		while(achou==false){
			int numLido = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero que você deseja advinhar entre 0-100"));
			if (numLido==numProcurado){
				achou = true;
				
			}else if (numLido<numProcurado){
				System.out.println("Errou! O número procurado é maior");
				pontuacao--;
			}else{
			System.out.println("Errou! O número procurado é menor" );
			pontuacao--;
			}
		}
		System.out.printf("Parabens! você ganhou %d pontos",pontuacao);
		
	}

}
