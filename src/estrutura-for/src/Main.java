import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes que quer somar:");
        int quantVezes = sc.nextInt();

        int soma = 0;
        for(int i = 0; i < quantVezes; i++){


            System.out.println("Digite um numero para somar:");

            int numero = sc.nextInt();
            soma += numero;

            System.out.printf("Soma: %d %n", soma);
        }

        sc.close();


    }
}