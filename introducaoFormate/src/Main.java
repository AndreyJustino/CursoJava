import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "Olá, mundo!";
        System.out.println(str); //println: quebra a linha

        double number = 1234.123456789;

        System.out.printf("%.2f%n", number); //%.2f semelhante ao python
        // o "%n" no final é para quebra linha

        System.out.printf("%.4f%n", number);

        Locale.setDefault(Locale.US); // tipo de fomartação que sera usada

        System.out.printf("%.3f%n", number);//agr sera exibido com "." em vez de ","

        String name = "Andrey";
        int age = 19;

        System.out.println("Seu nome é " + name + " ?");

        System.out.printf("Seu nome é %s, sua idade é %d e numero é %.3f",
                name, age, number);
    }
}