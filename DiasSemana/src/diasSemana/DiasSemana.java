/**
 * 
 */
package diasSemana;

import java.util.Scanner;

/**
 * 
 * @author Daniel Calatrava González
 * @version 22/02/2022 1.0
 *
 */
//Inicio del programa y declaración de variables:
public class DiasSemana {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int diaIntroducido;
			String diaSemana = null;
// Solicitud de datos al usuario
			System.out.println("El programa te devuelve el día de la semana seleccionando:");
			System.out.println("1.- Lunes.");
			System.out.println("2.- Martes.");
			System.out.println("3.- Miércoles.");
			System.out.println("4.- Jueves.");
			System.out.println("5.- Viernes.");
			System.out.println("6.- Sábado.");
			System.out.println("7.- Domingo.");
			System.out.println("_____________________________________________________________");
			System.out.print("Dime un número y te digo a qué día de la semana corresponde: ");
			diaIntroducido = scanner.nextInt();
// Realizamos comparaciones y mostramos el resultado
			decisionDia(diaIntroducido);
		}
	}

	/**
	 * Método con el que a partir del número introducido pone una respuesta u otra
	 * @param numerodia Método con el que a partir del número introducido pone una respuesta u otra
	 */
	public static void decisionDia(int numerodia) {
		String diaSemana;
		switch (numerodia) {
		case 1:
			diaSemana = "El día seleccionado es LUNES";
			break;
		case 2:
			diaSemana = "El día seleccionado es MARTES";
			break;
		case 3:
			diaSemana = "El día seleccionado es MIÉRCOLES";
			break;
		case 4:
			diaSemana = "El día seleccionado es JUEVES";
			break;
		case 5:
			diaSemana = "El día seleccionado es VIERNES";
			break;
		case 6:
			diaSemana = "El día seleccionado es SÁBADO";
			break;
		case 7:
			diaSemana = "El día seleccionado es DOMINGO";
			break;
		default:
			diaSemana = "ERROR: número incorrecto.";
		}
		System.out.println(diaSemana);
	}
}
