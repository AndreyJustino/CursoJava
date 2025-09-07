import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataGlobalParaLocal {
    public static void main(String[] args) {
        LocalDate data = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDateTime dataTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());

        System.out.println("data = " + data);
        System.out.println("dataTime = " + dataTime);

        System.out.println("=========================================================");

        System.out.println("dia = " + data.getDayOfMonth());
        System.out.println("mes = " + data.getMonth().getDisplayName(TextStyle.FULL, Locale.of("pt-BR")));
        System.out.println("ano = " + data.getYear());

        System.out.println("=========================================================");

        System.out.println("hora = " + dataTime.getHour());
        System.out.println("minutos = " + dataTime.getMinute());
        System.out.println("segundos = " + dataTime.getSecond());
        System.out.println("nanosegundos = " + dataTime.getNano());
    }
}
