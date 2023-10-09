import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		String num_string = JOptionPane.showInputDialog("Introduce el número deseado");
		int num = Integer.parseInt(num_string);

		factorial(num);
	}
	
	public static void factorial(int num) {
		long factorial = num;
		if(num < 0) {
			JOptionPane.showMessageDialog(null,"Introduce un número positivo");
		}
		else {
			if(num == 0) {
				factorial = 1;
			}
			else {
				for(int i=num-1; i>=1; i--) {
					factorial = factorial * i;
				}
			}
			JOptionPane.showMessageDialog(null,"El factorial de " +num+ " es " +factorial);
		}
	}

}
