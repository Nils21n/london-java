public abstract class Loan implements LoanConstants {
    private int loanNumber;
    private String customerLastName;
    private double amountOfLoan;
    private double interestRate;
    private int term;

    public Loan(int loanNumber, String customerLastName, double amountOfLoan, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        if (amountOfLoan <= MAX_LOAN_AMOUNT) {
            this.amountOfLoan = amountOfLoan;
        } else {
            this.amountOfLoan = MAX_LOAN_AMOUNT;
        }
        switch (term) {
            case LONG_TERM:
            case MEDIUM_TERM:
            case SHORT_TERM:
                this.term = term;
                break;
            default:
                this.term = SHORT_TERM;
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public double getAmountOfLoan() {
        return amountOfLoan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNumber=" + loanNumber +
                ", customerLastName='" + customerLastName + '\'' +
                ", amountOfLoan=" + amountOfLoan +
                ", interestRate=" + interestRate +
                ", term=" + term +
                '}';
    }
}
