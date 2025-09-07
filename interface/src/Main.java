import entities.CarRental;
import entities.Vehicle;
import service.BrazilTaxService;
import service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime dateStart = LocalDateTime.parse(sc.nextLine(), formatter);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime dateFinish = LocalDateTime.parse(sc.nextLine(), formatter);

        System.out.print("Entre com o preço por hora: " );
        double priceHours = sc.nextDouble();

        System.out.print("Entre com o preço por dia: " );
        double priceDay = sc.nextDouble();

        sc.close();

        Vehicle vehicle = new Vehicle(model);

        CarRental car = new CarRental(dateStart, dateFinish, vehicle);

        RentalService rentalService = new RentalService(priceHours, priceDay, new BrazilTaxService());

        rentalService.processInvoice(car);

        System.out.println("FATURA");
        System.out.println("Pagamento basico: " + car.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + car.getInvoice().getTax());
        System.out.println("Pagamento total: " + car.getInvoice().totalPayment());

    }
}