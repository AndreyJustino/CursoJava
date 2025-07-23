package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valueHours;
    private Integer hours;

    public Double totalValue(){
        return this.valueHours * hours;
    }

    public HourContract() {
    }

    public HourContract(LocalDate date, Double valueHours, Integer hours) {
        this.date = date;
        this.valueHours = valueHours;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValueHours() {
        return valueHours;
    }

    public void setValueHours(Double valueHours) {
        this.valueHours = valueHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
