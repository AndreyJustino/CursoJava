import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatoPersonalizado {
    public static void main(String[] args) {
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();

        //pegando horario de londres mas com o formato3 pego de acordo com o do sistema do usuario
        Instant d3 = Instant.now();

        System.out.println("=========================================================");
        System.out.println("d1 = " + d1.format(formato1)); //19/07/2025
        System.out.println("d1 = " + formato1.format(d1)); //19/07/2025

        System.out.println("=========================================================");
        System.out.println("d2 = " + d2.format(formato2));
        System.out.println("d2 = " + formato2.format(d2));

        System.out.println("=========================================================");
        System.out.println("d3 = "  + formato3.format(d3));

        System.out.println("=========================================================");
        ZonedDateTime zona = ZonedDateTime.now();
        System.out.println(zona);
    }
}
