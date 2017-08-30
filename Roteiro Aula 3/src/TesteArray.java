import javax.swing.JOptionPane;

public class TesteArray {
	
	public static void main(String [] args){
		String [] nomes = new String[3];
		System.out.println(nomes.length);
		
		for (int k =0; k<nomes.length;k++){
			nomes[k] = JOptionPane.showInputDialog("Digite um nome");
		}
		JOptionPane.showMessageDialog(null,"O primeiro nome foi"+nomes[0]);
		JOptionPane.showMessageDialog(null,"O útimo nome foi:"+nomes[nomes.length-1]);
	}

}
