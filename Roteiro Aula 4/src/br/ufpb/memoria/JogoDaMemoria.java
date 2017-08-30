package br.ufpb.memoria;

import javax.swing.JOptionPane;

public class JogoDaMemoria {
	
	public static void main(String[] args){
		int pontos = 100;
		String[] cartas;
		String[] cartasMostradas;
		cartas = leCartas(6);
		cartasMostradas=leTabuleiroVazio(6);
		boolean acabou= false;
		
		while(acabou == false){
			mostraTabuleiro(cartasMostradas);
			int posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira posicao [0-5]"));
			int posicao2=Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda posicao [0-5]"));
			cartasMostradas[posicao]=cartas[posicao];
			cartasMostradas[posicao2]=cartas[posicao];
			mostraTabuleiro(cartasMostradas);
			if(!cartasMostradas[posicao].equals(cartasMostradas[posicao2])){
				cartasMostradas[posicao]="X";
				cartasMostradas[posicao2]="X";
				pontos-=10;
			}
			if(jaGanhou(cartasMostradas)){
				acabou =true;
				JOptionPane.showMessageDialog(null, "Parabéns"+pontos+" pontos");
			}
		}	
	}
public static boolean jaGanhou(String[] cartas){
	for(int k=0;k<cartas.length;k++){
		if(cartas[k].equals("X")){
			return false;
		}
	}
	return true;
}

public static void mostraTabuleiro(String[]cartas){
	String tab="";
	for(int k=0;k<cartas.length;k++){
		tab=tab+cartas[k]+"";
	}
	JOptionPane.showMessageDialog(null, tab);
}




public static String[] leCartas(int n){
	String[] cartas = new String[n];
	for(int k=0; k < n;k++){
		cartas[k]= JOptionPane.showInputDialog("Digite o próxima carta");
			
		}
		return cartas;
	}

public static String[] leTabuleiroVazio(int n){
	String[] tabuleiro = new String[n];
	for (int k=0;k<n;k++){
		tabuleiro[k] = "X";
	}
	return tabuleiro;
}

}