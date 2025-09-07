import java.security.InvalidParameterException;

public class BrazilianInterestService implements InterestService{

    private final double interestRate;

    public BrazilianInterestService(double interesRate) {
        this.interestRate = interesRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double paymente(double amount, int months) {
        return InterestService.super.paymente(amount, months);
    }
}
