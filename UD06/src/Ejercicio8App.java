import java.util.Scanner;

public class Ejercicio8App {

	public static void main(String[] args) {
		double valores[] = new double[10];
		
		rellenar(valores);
		mostrar(valores);

	}
	
	public static void rellenar(double[] valores) {
		int añadidas=0;
		Scanner sc = new Scanner(System.in);
		do {

			
			System.out.println("Introduce un valor numérico");
			String valor_string = sc.next();
			double valor = Double.parseDouble(valor_string);
			
			
			valores[añadidas] = valor;
			añadidas++;
		}
		while(añadidas < 10);
		sc.close();
	}
	
	public static void mostrar(double[] valores) {
		for(int i = 0; i <valores.length; i++) {
			 System.out.println("Índice "+i+" = "+valores[i]);
		}
	}

}
