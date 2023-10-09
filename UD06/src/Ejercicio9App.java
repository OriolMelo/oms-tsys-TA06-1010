import java.util.Scanner;
public class Ejercicio9App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamaño;
		do {
			System.out.println("Introduce el tamaño del array (mayor que 0)");
			tamaño = sc.nextInt();
		}
		while(tamaño <= 0);

		
		int numeros[] = new int[tamaño];

		System.out.println("Introduce el número mínimo");
		int min = sc.nextInt();
		System.out.println("Introduce el número máximo");
		int max = sc.nextInt();
		
		sc.close();
		
		rellenar(numeros, min, max);
		mostrar(numeros);
		
	}
	
	public static void rellenar(int numeros[], int min, int max) {
		int posicion = 0;
		do {
			int aleatorio = (int)Math.floor(Math.random() * (max - min + 1) + min);
			numeros[posicion] = aleatorio;
			posicion++;
		}
		while(posicion < numeros.length);

	}

	public static void mostrar(int numeros[]) {
		double suma = 0;
		for(int i = 0; i < numeros.length; i++) {
			suma = suma+ numeros[i];
			 System.out.println("Número "+(i+1)+" = "+numeros[i]);
		}
		 System.out.println("Suma de todos los números = "+suma);
	}
}
