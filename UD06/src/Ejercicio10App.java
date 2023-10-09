import java.util.Scanner;

public class Ejercicio10App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamaño = 0;
		do {
			System.out.println("Introduce el tamaño del array (mayor que 0)");
			tamaño = sc.nextInt();
		}
		while(tamaño <= 0);

		
		int numeros[] = new int[tamaño];

		int min, max;
		boolean rango_primos = false;
		do {
			System.out.println("Introduce el número mínimo (mayor o igual que 0)");
			min = sc.nextInt();
			while(min < 0) {
				System.out.println("Introduce el número mínimo (mayor o igual que 0)");
				sc.nextInt();
			}
			System.out.println("Introduce el número máximo (mayor o igual que 0)");
			max = sc.nextInt();
			while(max < 0) {
				System.out.println("Introduce el número máximo (mayor o igual que 0)");
				sc.nextInt();
			}
			if(!existenPrimos(min, max)) {
				System.out.println("No hay números primos entre esos dos valores, vuelve a introducir un rango");
			}
			else {
				rango_primos = true;
			}
		}while(!rango_primos);
		
		sc.close();

		int mayor_primo = rellenar(numeros, min, max);
		mostrar(numeros, mayor_primo);
		
	}
	
	public static int rellenar(int numeros[], int min, int max) {
		int posicion = 0;
		int mayor_primo = -1;
		do {
			int aleatorio =-1;
			do {
				aleatorio = (int)Math.floor(Math.random() * (max - min + 1) + min);
			}while(!esPrimo(aleatorio));
			
			numeros[posicion] = aleatorio;
			if(aleatorio>mayor_primo)
				mayor_primo = aleatorio;
			posicion++;
		}
		while(posicion < numeros.length);

		return mayor_primo;
	}

	public static void mostrar(int numeros[], int mayor_primo) {
		double suma = 0;
		for(int i = 0; i < numeros.length; i++) {
			suma = suma+ numeros[i];
			 System.out.println("Número "+(i+1)+" = "+numeros[i]);
		}
		 System.out.println("Mayor primo del array = "+mayor_primo);
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
	
	public static boolean existenPrimos(int min, int max) {
		boolean existen = false;
		int i = min;
		while(i <= max && !existen) {
			if (esPrimo(i))
				existen = true;
			i++;
		}
		return existen;
	}
}
