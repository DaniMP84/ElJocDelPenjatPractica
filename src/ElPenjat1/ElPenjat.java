package ElPenjat1;
import java.util.Scanner;
public class ElPenjat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner y variables a usar + array.
		Scanner entrada = new Scanner(System.in);
		
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
		for(int i = 0; i < palabrasParaElegir.length;i++) {
			System.out.println(i + ": " + palabrasParaElegir[i]);		
		}
		int indicePalabra = entrada.nextInt();
		String PalabraSecreta = palabrasParaElegir[indicePalabra].toLowerCase();
		System.out.println("¿Cuantos jugadores habrá?");
		jugadores = entrada.nextInt();
		System.out.println("¿Cuantas rondas jugaréis?");
		rondas = entrada.nextInt();
		System.out.println("Elige una letra");
		letra = entrada.next().charAt(0);
		
		
		
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
