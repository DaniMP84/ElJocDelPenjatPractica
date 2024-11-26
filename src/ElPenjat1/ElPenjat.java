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
		System.out.println("*Benvenido al juego Del Colgado*");
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
		
		
		
		//Inicio del bucle del juego.
		for(int ronda = 1; ronda <= rondas; ronda++) {
			System.out.println("/n Comienza la ronda" + ronda);
		
		
		//Turno de cada jugador y intentos restantes.
		for(int i = 0; i < jugadores; i++) {
			int intentosRestantes = 6;
		
		
		//Indicador para saber si el jugador adivina, se inicia con false al inicio de cada jugador porque al inicio no esta adivinada, si se adivina cambiara a ture.
		boolean palabraAcertada = false;
		
		//concatenación de texto en la que muestro el nombre del jugador y el estado de la palabra secreta.
		System.out.println("/n Turno de " + nombreJugadores[i] + " La palabra es: " + new String(estadoPalabra));
		
		
		//Bucle que se repite mientras el jugador actual tenga intentos y no haya adivinado la palabra.
		While(intentosRestantes > 0 && !palabraAcertada) {
			System.out.println("Tus intentos restantes son: " + intentosRestantes);
			System.out.println(nombreJugadores[i] + ", introduce una letra");
			letra = entrada.next().toLowerCase().charAt(0);
		
			
		//Combrobación de si la letra esta en la palabra con el boolean acierto iniciandolo en false.	
		boolean acierto = false;
		//Recorrer la palabra para comprobar si la letra introducida coincide.
		for(int j = 0; j < palabraSecreta.length(); j++) {
			if(palabraSecreta.charAt(j) == letra && estadoPalabra[j] == '_') {
			   estadoPalabra[i] = letra;
			   acierto = true;
		}
	}
		
		
		
		
		
		
		
		
		
		
		

	}

}
