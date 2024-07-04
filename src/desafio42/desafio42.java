package desafio42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio42 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		List<Integer> numero_de_legajo= new ArrayList<>();
		List<String> apellido = new ArrayList<>();
		List<Integer> nombre = new ArrayList<>();

	
	
			
			System.out.println("Ingrese un numero de legajo: ");
			numero_de_legajo.add(entrada.nextInt());
			System.out.println("Ingrese el apellido del numero de legajo :");
			apellido.add(entrada.next());
			System.out.println("Ingrese el nombre del numero de legajo :");
			nombre.add(entrada.nextInt());
		}

}