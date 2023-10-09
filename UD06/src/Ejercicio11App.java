import java.util.Scanner;

public class Ejercicio11App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamaño;
		do {
			System.out.println("Introduce el tamaño del array (mayor que 0)");
			tamaño = sc.nextInt();
		}
		while(tamaño <= 0);

		
		int array1[] = new int[tamaño];
		int array2[] = new int[tamaño];

		System.out.println("Introduce el número mínimo");
		int min = sc.nextInt();
		System.out.println("Introduce el número máximo");
		int max = sc.nextInt();
		
		sc.close();
		
		rellenar(array1, min, max);
		array2 = array1;
		rellenar(array2, min, max);
		int array_resultado[] = multiplicar(array1, array2);
		mostrar(array1);
		mostrar(array2);
		mostrar(array_resultado);

	}

	public static void rellenar(int array[], int min, int max) {
		int posicion = 0;
		do {
			int aleatorio = (int)Math.floor(Math.random() * (max - min + 1) + min);
			array[posicion] = aleatorio;
			posicion++;
		}
		while(posicion < array.length);

	}
	public static int[] multiplicar(int array1[], int array2[]) {
		int resultado[] = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i] * array2[i];
		}
		return resultado;
	}
	
	public static void mostrar(int array[]) {
		double suma = 0;
		for(int i = 0; i < array.length; i++) {
			suma = suma+ array[i];
			 System.out.println("Número "+(i+1)+" = "+array[i]);
		}
	}

}
