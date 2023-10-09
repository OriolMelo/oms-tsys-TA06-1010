import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		String num_string = JOptionPane.showInputDialog("Introduce el número deseado");
		int num = Integer.parseInt(num_string);

		if(esPrimo(num)) 
			JOptionPane.showMessageDialog(null,"El número " +num+ " es primo");
		else
			JOptionPane.showMessageDialog(null,"El número " +num+ " no es primo");

	}

	public static boolean esPrimo(int num) {
		int i = 2;
		boolean primo = true;
		if(num < 0) {
			primo = false;
		}
		while(i <= num/2 && primo) {
			if(num%i == 0) {
				primo = false;
			}
			i++;
		}
		return primo;
	}
}
