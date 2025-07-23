import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        int quantContracts;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Enter department's name:");
        worker.setDepartment(new Department(sc.nextLine()));

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        worker.setName(sc.nextLine());

        System.out.print("Level: ");
        worker.setWorkerLevel(WorkerLevel.valueOf(sc.nextLine().toUpperCase()));

        System.out.print("Base salary: ");
        worker.setBaseSalary(sc.nextDouble());

        System.out.print("How many contracts to this worker? ");
        quantContracts = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < quantContracts; i++) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            HourContract contract = new HourContract();

            System.out.printf("Enter contract #%d data: \n", i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.nextLine();

            contract.setDate(LocalDate.parse(date, formatter));

            System.out.print("Value per hour: ");
            contract.setValueHours(sc.nextDouble());

            System.out.print("Duration (Hours): ");
            contract.setHours(sc.nextInt());

            sc.nextLine();

            worker.addContract(contract);

        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.nextLine();

        String[] monthYearSplit = monthYear.split("/");

        double income = worker.income(Integer.parseInt(monthYearSplit[1]), Integer.parseInt(monthYearSplit[0]));

        sc.close();

        System.out.printf("Name: %s \n", worker.getName());
        System.out.printf("Department: %s \n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f \n", monthYear, income);

    }
}