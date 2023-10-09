import java.util.Scanner;

public class Ejercicio7App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros");
		int euros = sc.nextInt();
		
		System.out.println("Introduce la moneda deseada");
		String moneda = sc.next();
		
		sc.close();
		
		convertirEuros(euros, moneda);
	}
	
	public static void convertirEuros(double euros, String moneda) {
		final double LIBRAS = 0.86;
		final double DOLARES = 1.28611;
		final double YENES = 129.852;
		double conversion = 0;
		switch(moneda) {
		 case "LIBRAS":
			 conversion = euros * LIBRAS;
			 System.out.println(euros+ " euros son "+conversion+" "+moneda);
			 break;
		 case "DOLARES":
			 conversion = euros * DOLARES;
			 System.out.println(euros+ " euros son "+conversion+" "+moneda);
			 break;
		 case "YENES":
			 conversion = euros * YENES;
			 System.out.println(euros+ " euros son "+conversion+" "+moneda);
			 break;
		 default:
			 System.out.println("Hay que introducir la moneda LIBRAS, DOLARES o YENES");
		}
		
	}

}
