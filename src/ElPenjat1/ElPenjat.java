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
		String palabraSecreta = palabrasParaElegir[indicePalabra].toLowerCase();
		
		/*Solicito número de jugadores y le añado un error en caso de no elegir el mínimo que son 2 con el bucle while, mientras elija menos de 2 saldra el mensaje d error
		guardo la respuesta en la variable jugadores.*/
		System.out.println("¿Cuantos jugadores habrá? Debes elegir mínimo 2 jugadores");
		jugadores = entrada.nextInt();
		while(jugadores < 2) {
			System.out.println("Error: Tienes que elegir al menos 2 jugadores");		
			jugadores = entrada.nextInt();
		}
		
		
		/*Solicito el nombre de los jugadores y creo una array para guardarlos ahi.El bucle es tan grande como el número de jugadores, pedirá
		 * cantidad de nombres en función de cuantos jugadores hayan indicado que hay.
		 * Además uso el (i + 1) para que cuando pida nombre de jugadores empiece por el 1 y no por el 0*/
		String[] nombreJugadores = new String[jugadores];
		for(int i = 0; i < jugadores;i++) {
			System.out.println("Introducir nombre del jugador" + (i + 1) + ": ");
			nombreJugadores[i] = entrada.next();
		}
		
		
		
		//Pregunto cuantas rondas quiere jugar y lo guardo en la variable rondas.
		System.out.println("¿Cuantas rondas jugaréis?");
		rondas = entrada.nextInt();
		
		//Array en donde se guarda el estado de la palabra secreta y bucle correspondiente.Inicialmente cada letra del array tendrá un '_'.
		char[] estadoPalabra = new char[palabraSecreta.length()];
		for(int i = 0; i < estadoPalabra.length;i++) {
			estadoPalabra[i] = '_';
		}
		
		
		//Inicio el contador de rondas ganadas creando un array que almacenará el número de rondas ganadas por cada usuario.
		int[] lasRondasGanadas = new int[jugadores];
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		

	}

}
