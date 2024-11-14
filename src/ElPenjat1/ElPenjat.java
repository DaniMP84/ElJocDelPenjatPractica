package ElPenjat1;
import java.util.Scanner;
public class ElPenjat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner y variables a usar + array.
		Scanner entrada = new Scanner(System.in);
		String palabra;
		int jugadores;
		int rondas;
		char letra;
		String[] palabrasParaEelegir = {"Casa", "Lobo", "Caramelo", "Papel", "Perro", "Gato", "Ordenador", "Castaña",
				"Pantano", "Rock"};
		
		
		//Bienvenida y pciones para el usuario.
		System.out.println("***************************************************************");
		System.out.println("*Benvingut Al Joc Del Penjat*");
		System.out.println("***************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("¿Que palabra eliges?");
		palabra = entrada.nextLine();
		System.out.println("¿Cuantos jugadores habrá?");
		jugadores = entrada.nextInt();
		System.out.println("¿Cuantas rondas jugaréis?");
		rondas = entrada.nextInt();
		System.out.println("Elige una letra");
		letra = entrada.next().charAt(0);
		
		
		for(int i = 0; i < rondas;i++){
			if (letra == palabrasParaEelegir[0]){
			System.out.println(i);	
			}i++;
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
