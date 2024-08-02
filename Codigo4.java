package org.generation;

import java.util.Scanner;

/**
 * Programa simula el juego de Piedra, Papel o Tijeras.
 * El usuario introduce las elecciones de dos jugadores, 
 * y el programa determina el ganador o si hay un empate.
 */

public class Codigo4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);// se agrega public static void
		    
	        //Entrada para que el jugador eliga su opción
	        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	        String jugador1 = scanner.nextLine().toLowerCase(); //se renombra variable y se agrega toLowerCase
 
	        //Se renombra al jugador 
	        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	        Scanner jugador2 = scanner.nextLine().toLowerCase();
	        
	        //Validar las elecciones de los jugadores, se refactoriza
	        if (!esEleccionValida(jugador1) || !esEleccionValida(jugador2)) {
	        	System.out.println("Entrada inválida. Asegúrese de introducir 'piedra', 'papel' o 'tijeras'.");
	            return;
	        } 

    // Determinar el resultado
       String resultado = obtenerResultado(jugador1, jugador2);
       System.out.println(resultado);
   }
   
	 /**
	     * Verifica si la elección del jugador es válida.
	     * @param eleccion Elección del jugador
	     * @return true si la elección es válida, false en caso contrario
	     */
	    private static boolean esEleccionValida(String eleccion) {
	        return eleccion.equals("piedra") || eleccion.equals("papel") || eleccion.equals("tijeras");
	    }

	    /**
	     * Determina el resultado del juego.
	     * @param jugador1 Elección del jugador 1
	     * @param jugador2 Elección del jugador 2
	     * @return Mensaje indicando el resultado del juego
	     */
	    
	    private static String obtenerResultado(String jugador1, String jugador2) {
	        if (jugador1.equals(jugador2)) {
	            return "Empate";
	        }

	        switch (jugador1) {
	            case "piedra":
	                return (jugador2.equals("tijeras")) ? "Gana el jugador 1" : "Gana el jugador 2";
	            case "papel":
	                return (jugador2.equals("piedra")) ? "Gana el jugador 1" : "Gana el jugador 2";
	            case "tijeras":
	                return (jugador2.equals("papel")) ? "Gana el jugador 1" : "Gana el jugador 2";
	            default:
	                throw new IllegalStateException("Elección inesperada: " + jugador1);
	        }
	    }
	}
}
