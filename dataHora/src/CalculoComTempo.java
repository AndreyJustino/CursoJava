import java.time.*;
import java.time.format.DateTimeFormatter;

public class CalculoComTempo {
    public static void main(String[] args) {
        LocalDate dataNow = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate menosDias = dataNow.minusDays(10);
        LocalDate maisMeses = dataNow.plusMonths(2);
        LocalDate menosAnos = dataNow.minusYears(5);

        System.out.println("menos dia = " + menosDias);
        System.out.println("soma mes = " + maisMeses);
        System.out.println("menos ano = " + menosAnos);

        LocalDateTime dataTimeNow = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDateTime dateTimeFuture = dataTimeNow.plusDays(7);

        // para usar o duration tem que tem hora minuto logo o ideal é usar localDateTime pra cima
        Duration durationLocalDateTime = Duration.between(dataTimeNow, dateTimeFuture);

        //convertendo localDate para localDateTime
        dataNow.atStartOfDay(); //isso retorna um localDateTime com a data passada mas as 00:00

        Duration durationLocalDate = Duration.between(dataNow.atStartOfDay(), dataNow.plusDays(7).atStartOfDay());

        System.out.println("localDateTime " + durationLocalDateTime.toHours());
        System.out.println("localDate " + durationLocalDate.toHours() );
    }
}
