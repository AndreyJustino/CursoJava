import java.util.Locale;
import java.util.Scanner;

public class entradaDadoConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//String src;
		// src = sc.next(); //ler strings
		//System.out.println("Você digitou " + src);
		
		//int number;
		//number = sc.nextInt(); //ler inteiros
		//System.out.println("Você digitou o numero: " + number);
		
		
		
		Locale.setDefault(Locale.US); // locale tem q vir antes do scan pra funcionar
		// se colocar dentro ele vai aceita numero com virgurla e dar erro em numero com ponto
		
		
		
		//double outherNumber;
		//outherNumber = sc.nextDouble(); // ler numero flutuante
		//System.out.println("Você digitou o numero: " + outherNumber);
		
		
		
		
		//char text;
		//text = sc.next().charAt(0); //chartAt(index) serve pra pegar uma letra de uma determinada palavra
		//System.out.println("Você digitou: " + text);
		//sc.close();
		
		
		//para ler varios valores basta chama os metodos correspondente rodar e separar por espaço
		//String src;
		//int number;
		//double outherNumber;
		
		//src = sc.next();
		//number = sc.nextInt();
		//outherNumber = sc.nextDouble();
		
		//System.out.println(src);
		//System.out.println(number);
		//System.out.println(outherNumber);
		
		// como digitar "frases"
		String frase1, frase2, frase3;
		int z;
		
		z = sc.nextInt();
		//sc.nextLine(); //esse next é para consumir o "enter" que ficara pendente
		frase1 = sc.nextLine();
		frase2 = sc.nextLine();
		frase3 = sc.nextLine();
		
		System.out.println(z);
		System.out.println(frase1);
		System.out.println(frase2);
		System.out.println(frase3);
		
		sc.close();
	}

}               