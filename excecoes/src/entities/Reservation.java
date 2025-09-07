package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;

        if (checkout.isAfter(checkin)){
            this.checkout = checkout;
        }else{
            throw new RuntimeException("Data de checkout é inferior a de checkin ");
        }
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public Integer duration(){
        Period period = Period.between(this.checkin, this.checkout);

        return period.getDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout){

        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())){
            throw new RuntimeException("Alteração de reserva só pode ocorrer para datas futuras");
        }

        if (!checkout.isAfter(checkin)){
            throw new RuntimeException("Data de checkout é inferior a de checkin ");
        }

        this.checkin = checkin;
        this.checkout = checkout;

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("Room Number: %d, Checkin: %s, Checkout: %s, %d night",
                this.roomNumber,
                this.checkin.format(formatter),
                this.checkout.format(formatter),
                duration());
    }
}
