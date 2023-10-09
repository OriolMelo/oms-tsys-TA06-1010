import java.util.Scanner;

public class Ejercicio12App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamaño;
		do {
			System.out.println("Introduce el tamaño del array (mayor que 0)");
			tamaño = sc.nextInt();
		}
		while(tamaño <= 0);
		
		int digito;
		do {
			System.out.println("Introduce el dígito final deseado de 0 a 9");
			digito = sc.nextInt();
		}
		while(digito < 0 || digito > 9);
		
		sc.close();
		
		int min = 1;
		int max = 300;
		int num_encontrados = 0;
		int[] aleatorios = new int[tamaño];
		num_encontrados=rellenar(aleatorios, min, max, num_encontrados, digito);
		int[] aceptados = new int[num_encontrados];
		añadirCorrectos(aceptados, aleatorios, digito);
		System.out.println("Números generados");
		mostrar(aleatorios);
		System.out.println("Números acabados en "+ digito);
		mostrar(aceptados);
	}

	public static int rellenar(int array[], int min, int max, int num_encontrados, int digito) {
		int posicion_aleatorios = 0;
		do {
			int aleatorio = (int)Math.floor(Math.random() * (max - min + 1) + min);
			array[posicion_aleatorios] = aleatorio;
			if(aleatorio%10 == digito) {
				num_encontrados++;
			}
			posicion_aleatorios++;
		}
		while(posicion_aleatorios < array.length);
		
		return num_encontrados;
	}
	
	public static void añadirCorrectos(int aceptados[], int aleatorios[],  int digito) {
		if(aceptados.length > 0) {
			int j = 0;
			for(int i = 0; i < aleatorios.length; i++) {
				if(aleatorios[i]%10 == digito) {
					aceptados[j] = aleatorios[i];
					j++;
				}
			}
		}
	}
	
	public static void mostrar(int array[]) {
		if(array.length == 0) {
			System.out.println("No ha habido ningún número acabado en ese dígito");
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Número "+(i+1)+" = "+array[i]);
		}
	}
}
