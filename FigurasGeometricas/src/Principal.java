import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe el número de la figura que deseas ocupar:");
		 System.out.println("1- Cuadrado");
		 System.out.println("2- Rectangulo");
		 System.out.println("3- Circulo");
		 int fig = sc.nextInt();
		 
		 switch (fig) {
		 case 1 :
			 System.out.println("Cuadrado");
			 System.out.println("Ingresa el valor de un lado:");
			 Cuadrado cuadrado = new Cuadrado();
			 cuadrado.lado = sc.nextFloat();
			 System.out.println(cuadrado.areaCuadrado());
			 
			 break;
		 case 2 :
			 System.out.println("Rectangulo");
			 System.out.println("Ingresa el valor de la base:");
			 Rectangulo rectangulo = new Rectangulo();
			 rectangulo.base = sc.nextFloat();
			 System.out.println("Ingresa el valor de la altura:");
			 rectangulo.altura = sc.nextFloat();
			 System.out.println(rectangulo.areaRectangulo());			 		 
	
			 break;
		 case 3 :
			 System.out.println("Circulo");
			 System.out.println("Ingresa el numero del radio");
			 Circulo circulo = new Circulo();
			 circulo.radio = sc.nextFloat();
			 System.out.println(circulo.areaCirculo());
			 
			 break;
		default:
			System.out.println("Opcion no valida");
			break;
		 }
		 
	}

}
