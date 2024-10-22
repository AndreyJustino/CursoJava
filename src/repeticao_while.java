import java.util.Scanner;

public class repeticao_while {

	public static void Main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 0) {
			x = sc.nextInt();
		}
		
		sc.close();

	}

}
