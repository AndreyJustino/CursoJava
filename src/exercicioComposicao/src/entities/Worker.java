package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;
    private Department department;

    private ArrayList<HourContract> contracts = new ArrayList<>();

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        double total = 0;

        for (HourContract hourContract : this.contracts){
            if (hourContract.getDate().getYear() == year &&
                    hourContract.getDate().getMonthValue() == month){

                total += hourContract.totalValue();
            };
        }

        return total + this.baseSalary;
    };

    public Worker() {
    }

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }
}
