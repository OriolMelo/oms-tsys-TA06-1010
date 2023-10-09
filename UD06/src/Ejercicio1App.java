import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		double area = 0;
		String figura = JOptionPane.showInputDialog("Introduce la figura que quieres calcular en minúsculas sin tildes");
		
		switch(figura) {
			case "circulo":
				area=areaCirculo(area);
				break;
			case "triangulo":
				area=areaTriangulo(area);
				break;
			case "cuadrado":
				area=areaCuadrado(area);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Introduce una de las figuras circulo, triangulo o cuadrado");
		}
		if(area!=0) {
			if(area!=-1)
			JOptionPane.showMessageDialog(null,"El área es "+area);
		else
			JOptionPane.showMessageDialog(null,"Los valores introducidos han de ser mayores que 0");
	
		}
	}
	
	public static double areaCirculo(double area) {
		String string_radio = JOptionPane.showInputDialog("Introduce el radio del círculo (mayor que 0)");
		double radio = Double.parseDouble(string_radio);
		
		if(radio>0) {
			area = Math.PI*(Math.pow(radio, 2));
		}
		else {
			area = -1;
		}
		return area;
	}
	
	public static double areaTriangulo(double area) {
		String string_base = JOptionPane.showInputDialog("Introduce la base del triángulo (mayor que 0)");
		double base = Double.parseDouble(string_base);

		String string_altura = JOptionPane.showInputDialog("Introduce la altura del triángulo (mayor que 0)");
		double altura = Double.parseDouble(string_altura);
		
		if(base<=0 || altura <= 0) {
			area = -1;
		}
		else {
			area = (base*altura)/2;
		}
		return area;
	}
	
	public static double areaCuadrado(double area) {
		String string_lado = JOptionPane.showInputDialog("Introduce el lado del cuadrado (mayor que 0)");
		double lado = Double.parseDouble(string_lado);
		
		if(lado>0) {
			area = lado*lado;
		}
		else {
			area = -1;
		}
		return area;
	}
	

}
