import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",mat[i][count]);
            count++;
        }

        /*
            solução do professor

            for (int i = 0; i < n; i++) {
                System.out.printf("%d ",mat[i][i]);
            }

         */


        int quantNeg = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0){
                    quantNeg++;
                }
            }
        }

        System.out.printf("\nQuantidade de numeros negativos: %d",quantNeg);

        sc.close();
    }
}