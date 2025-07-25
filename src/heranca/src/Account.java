public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){

        if (this.balance > 0) {
            this.balance =- amount + 5;
        }else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void deposit(Double amount){
        this.balance =+ amount;
    }
}
