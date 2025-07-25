public final class SavingAccount extends Account{ //final impede que essa classe seja herdada
    private Double interestRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance =+ balance * interestRate;
    }

    @Override
    public void withdraw(Double amount){

        if (this.balance > 0) {
            this.balance =- amount;
        }else {
            System.out.println("Saldo insuficiente");
        }

    }
}
