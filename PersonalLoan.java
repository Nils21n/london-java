public class PersonalLoan extends Loan {
  public PersonalLoan(double loanAmount, int term) {
    super(loanAmount, term);
    setInterestRate(2 + getPrimeRate());
  }
}