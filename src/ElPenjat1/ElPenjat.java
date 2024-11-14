package ElPenjat1;
import java.util.Scanner;
public class ElPenjat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String palabra;
		int jugadores;
		int rondas;
		char letra;
		String[] palabrasParaElegir = {"Casa", "Lobo", "Caramelo", "Papel", "Perro", "Gato", "Ordenador", "Castaña",
				"Pantano", "Rock"};
		
		System.out.println("¿Que palabra eliges?");
		palabra = entrada.nextLine();
		System.out.println("¿Cuantos jugadores habrá?");
		jugadores = entrada.nextInt();
		System.out.println("¿Cuantas rondas jugaréis?");
		rondas = entrada.nextInt();
		System.out.println("Elige una letra");
		letra = entrada.next().charAt(0);
		
		
		
		
		
		
		
		
		
		

	}

}
