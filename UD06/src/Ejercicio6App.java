import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		String num_string = JOptionPane.showInputDialog("Introduce el número deseado");
		int num = Integer.parseInt(num_string);
		
		int cifras = contarCifras(num);
		
		while(cifras == -1) {
			JOptionPane.showMessageDialog(null, "El número ha de ser positivo");
			num_string = JOptionPane.showInputDialog("Introduce el número deseado");
			num = Integer.parseInt(num_string);
			cifras = contarCifras(num);
		}
		JOptionPane.showMessageDialog(null,"El número "+num+" tiene "+cifras+" cifras");
	}

	public static int contarCifras(int num) {
		int cifras = 0;
		
		if(num<0) {
			cifras = -1;
		}
		else if(num==0) {
			cifras = 1;
		}
		else {
			while(num>0) {
				num=num/10;
				cifras++;
			}
		}
		return cifras;
	}
}
