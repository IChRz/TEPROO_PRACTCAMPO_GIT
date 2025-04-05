import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("¡Hola, " + nombre + "! ESTA ES MI PRÁCTICA DE CAMPO Nº 1 .");

        scanner.close();
	}

}
