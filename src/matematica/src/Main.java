public class Main {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        // sqrt = raiz quadrada
        // pow = potencia
        // abs = absoluto, tirar valor negativo se existir

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.printf("A raiz de %.2f é %.2f %n", x, A);
        System.out.printf("A raiz de %.2f é %.2f %n", y, B);
        System.out.printf("A raiz de 25 é %.2f %n", C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.printf("%.1f elevado a %.2f é igual a %.2f %n", x, y, A);
        System.out.printf("%.1f elevado ao quadrado é igual a %.2f %n", x, B);
        System.out.printf("5 elevado ao quadrado é igual a %.2f %n", C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.printf("O absoluto de %.1f é %.1f %n", y, A);
        System.out.printf("O absoluto de %.1f é %.1f %n", z, B);

        double a = 2;
        double b = 3;
        double c = 4;
        double delta, x1, x2;

        delta = Math.pow(b, 2.0) - 4 * a * c;

        if(delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println("O resultado é " + x1 + " e " + x2);
        } else {
            System.out.println("Delta negativo");
        }
    }
}