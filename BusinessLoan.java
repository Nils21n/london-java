public class BusinessLoan extends Loan {
  public BusinessLoan(double loanAmount, int term) {
    super(loanAmount, term);
    setInterestRate(1 + getPrimeRate());
  }
}