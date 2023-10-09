import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		int cantidad = 0;
		do {
			String cantidad_string = JOptionPane.showInputDialog("¿Cuántos números quieres generar?");
			cantidad = Integer.parseInt(cantidad_string);
		}while(cantidad<= 0);
		
		int aleatorios[] = new int[cantidad];
		rellenar(aleatorios);
		mostrar(aleatorios);
	}

	public static int calcularAleatorio(int min, int max) {
		
		int num_random = (int)Math.floor(Math.random() * (max - min + 1) + min);
		
		return num_random;
	}
	
	public static void rellenar(int[] aleatorios) {
		String min_string = JOptionPane.showInputDialog("Introduce el número mínimo");
		int min = Integer.parseInt(min_string);
		String max_string = JOptionPane.showInputDialog("Introduce el número máximo");
		int max = Integer.parseInt(max_string);
		for(int i=0; i<aleatorios.length; i++) {
			aleatorios[i] = calcularAleatorio(min, max);
		}
	}
	
	public static void mostrar(int[] aleatorios) {
		for(int i=0; i<aleatorios.length; i++) {
			System.out.println("Posición "+(i+1)+" = "+aleatorios[i]);
		}
	}
}
