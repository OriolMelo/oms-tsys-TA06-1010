import javax.swing.JOptionPane;

public class Ejercicio5App {

	public static void main(String[] args) {
		String num_string = JOptionPane.showInputDialog("Introduce el número deseado");
		int num = Integer.parseInt(num_string);
		
		while(num < 0) {
			JOptionPane.showMessageDialog(null,"El número ha de ser positivo");
			num_string = JOptionPane.showInputDialog("Introduce el número deseado");
			num = Integer.parseInt(num_string);
	
		}
		String conversion = conversor(num);
		JOptionPane.showMessageDialog(null,"El número " +num+ " es "+conversion);

	}

	public static String conversor(int num) {
		char binario_reves[] = new char[20];
		String binario;
		if(num == 0) {
			binario = "0";
		}
		else {
			int pos_array=0;
			while(num > 0) {
				int binario_actual = num%2;
				binario_reves[pos_array] = Character.forDigit(binario_actual, 10);
				num = num/2;
				pos_array++;
			}
			pos_array--;
			
			char binario_ordenado[] = new char[binario_reves.length];
			
			for(int i=0, j=pos_array; i <= pos_array; i++, j--) {
				binario_ordenado[i]=binario_reves[j];
			}
			
			binario = new String(binario_ordenado);
		}
		return binario;
	}
}
