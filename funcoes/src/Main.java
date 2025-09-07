import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite 3 numeros:");

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            int maior = max(n1, n2, n3);

            showValue(maior);
            
            sc.close();
    }

    public static int max(int x, int y, int z){
        int maior;

        if(x > y && x > z){
            maior = x;
        }else if(y > x && y > z){
            maior = y;
        }else{
            maior = z;
        }

        return maior;
    }

    public static void showValue(int value){
            System.out.printf("Maior = %d", value);
    }
}