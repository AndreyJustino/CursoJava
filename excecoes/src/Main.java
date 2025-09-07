import entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do quarto: ");
        int numberRoom = sc.nextInt();

        sc.nextLine();

        System.out.print("Data de Check-in (DD/MM/YYYY): ");
        String checkIn = sc.nextLine();

        System.out.print("Data de Check-out (DD/MM/YYYY): ");
        String checkOut = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Reservation reservation = null;

        try{
             reservation = new Reservation(numberRoom,
                    LocalDate.parse(checkIn, formatter),
                    LocalDate.parse(checkOut, formatter));
        } catch (RuntimeException e) {
            System.out.println("Erro em reservar: " + e.getMessage());
            return;
        }


        System.out.println("Reserva: "  + reservation.toString());

        System.out.println();

        System.out.println("Entre com os datas para atualização:");

        System.out.print("Data de Check-in (DD/MM/YYYY): ");
        checkIn = sc.nextLine();

        System.out.print("Data de Check-out (DD/MM/YYYY): ");
        checkOut = sc.nextLine();

        try {
            reservation.updateDates(
                    LocalDate.parse(checkIn, formatter),
                    LocalDate.parse(checkOut, formatter));
        } catch (RuntimeException e) {
            System.out.println("Erro em reservar: " + e.getMessage());
            return;
        }


        sc.close();
    }
}