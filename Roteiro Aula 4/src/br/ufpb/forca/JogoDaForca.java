package br.ufpb.forca;

import javax.swing.JOptionPane;

public class JogoDaForca {
	public static void main(String[] args){
		String palavra = JOptionPane.showInputDialog("Qual palavra?").toUpperCase();
		char[] palavraArray=new char[palavra.length()];
		for(int k=0;k<palavraArray.length;k++){
			palavraArray[k]='-';
		}
		int numVidas = 5;
		while (numVidas>= 0){
			imprimePalavraMostrada(palavraArray);
			String letraString=JOptionPane.showInputDialog("Advinhe uma letra").toUpperCase();;
			char letra = letraString.charAt(0);
			boolean achou = false;
			for(int k=0;k<palavra.length();k++){
				if(palavra.charAt(k)== letra){
					palavraArray[k] = letra;
				}
			}
			if (achou == false){
			numVidas--;
			}
			if (JogoDaForca.jaGanhou(palavraArray)==true){
				JOptionPane.showMessageDialog(null,"Parabéns!Você acertou a palavra"+palavra+"e sobraram"+numVidas+"vidas");
			}
		}
	}
	public static boolean jaGanhou(char [] palavraMostrada){
		boolean temUnderline=false;
		for(int k=0;k<palavraMostrada.length;k++){
			if (palavraMostrada[k]=='_'){
				temUnderline = true;
			}
	}
		if(!temUnderline){
			return true;
		}else{
			return false;
		}
	}
	
	private static void imprimePalavraMostrada(char[] palavraMostrada) {
		for (int k=0;k < palavraMostrada.length;k++){
			System.out.print(palavraMostrada[k]+" ");
		}
		System.out.println();

	}
	
}
