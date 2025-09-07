import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now(); //2025-07-19
        LocalDateTime d2 = LocalDateTime.now(); //2025-07-19T12:31:42.597372900
        Instant d3 = Instant.now(); //2025-07-19T15:31:42.597372900Z

        LocalDate d4 = LocalDate.parse("2025-12-25"); //2025-12-25
        LocalDateTime d5 = LocalDateTime.parse("2025-12-25T01:23"); //2025-12-25T00:00
        Instant d6 = Instant.parse("2025-12-25T01:23:45Z"); //2025-12-25T01:23:45Z

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d7 = LocalDate.parse("07/05/2005",formato1);
        LocalDateTime d8 = LocalDateTime.parse("07/05/2005 12:34", formato2);

        LocalDate d9 = LocalDate.of(2005, 05, 07);
        LocalDateTime d10 = LocalDateTime.of(2005, 05, 07, 12,34, 56);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d4 = " + d4);
        System.out.println("d5 = " + d5);
        System.out.println("d6 = " + d6);

        System.out.println("d7 = " + d7);
        System.out.println("d8 = " + d8);

        System.out.println("d9 = " + d9);
        System.out.println("d10 = " + d10);
    }
}