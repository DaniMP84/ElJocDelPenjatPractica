package ElPenjat1;
import java.util.Scanner;
public class ElPenjat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner y variables a usar + array.
		Scanner entrada = new Scanner(System.in);
		int indicePalabra;
		int jugadores;
		int rondas;
		char letra;
		//Estas son las palabras disponibles
		String[] palabrasParaElegir = {"Casa", "Lobo", "Caramelo", "Papel", "Perro", "Gato", "Ordenador", "Castaña",
				"Pantano", "Rock"};
		
		
		//Bienvenida y pciones para el usuario.
		System.out.println("***************************************************************");
		System.out.println("*Benvingut Al Joc Del Penjat*");
		System.out.println("***************************************************************");
		System.out.println("");
		System.out.println("");
		
		//Pregunto que palabra quiere y le aclaro que debe elegir un numero del indice para que no haya confusiones
		System.out.println("¿Que palabra eliges? Seleciona un número del indice");
		//Solicito que elija una palabra y la guardo en palabraSecreta.
		for(int i = 0; i < palabrasParaElegir.length;i++) {
			System.out.println(i + ": " + palabrasParaElegir[i]);		
		}		
		indicePalabra = entrada.nextInt();
		String PalabraSecreta = palabrasParaElegir[indicePalabra].toLowerCase();
		
		/*Solicito número de jugadores y le añado un error en caso de no elegir el mínimo que son 2 con el bucle while, mientras elija menos de 2 saldra el mensaje d error
		guardo la respuesta en la variable jugadores.*/
		System.out.println("¿Cuantos jugadores habrá? Debes elegir mínimo 2 jugadores");
		jugadores = entrada.nextInt();
		while(jugadores < 2) {
			System.out.println("Error: Tienes que elegir al menos 2 jugadores");		
			jugadores = entrada.nextInt();
		}
		
		System.out.println("¿Cuantas rondas jugaréis?");

		System.out.println("Elige una letra");

		
		
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
