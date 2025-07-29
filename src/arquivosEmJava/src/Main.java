import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File(".\\src\\in.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }

        }
    }
}