public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, "Andrey", 10000.0);
        BusinessAccount businessAccount = new BusinessAccount(2, "Alex", 200.0, 500.0);

        //UPCASTING
        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(3, "Maria", 400.0, 500.0);
        Account acc3 = new SavingAccount(4, "Nelio", 400.0, 0.9);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2; //aqui pega pq a instancia é account
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; //aqui da erro pq a instancia é saving

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}