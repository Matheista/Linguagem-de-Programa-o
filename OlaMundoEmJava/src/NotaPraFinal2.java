import javax.swing.JOptionPane;

public  class NotaPraFinal2 {
	public static void main(String [] args){
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota"));
		JOptionPane.showMessageDialog(null, "A nota lida foi " +nota1);
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota"));
		JOptionPane.showMessageDialog(null,"A nota lida foi "+nota2);
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3º nota"));
		JOptionPane.showMessageDialog(null,"A nota lida foi " +nota3);
		double media = (nota1+nota2+nota3)/3;
		JOptionPane.showMessageDialog(null,"A média lida foi " +media);
		

		
		
		
	}
}
