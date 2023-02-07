public class CreateLoans {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Loan[] loans = new Loan[5];

    System.out.print("Enter the current prime interest rate: ");
    double primeRate = input.nextDouble();
    Loan.setPrimeRate(primeRate);

    for (int i = 0; i < loans.length; i++) {
      System.out.print("Enter loan type (business or personal): ");
      String loanType = input.next();
      System.out.print("Enter loan amount: ");
      double loanAmount = input.nextDouble();
      System.out.print("Enter loan term (in years): ");
      int term = input.nextInt();

      if (loanType.equalsIgnoreCase("business")) {
        loans[i] = new BusinessLoan(loanAmount, term);
      } else if (loanType.equalsIgnoreCase("personal")) {
        loans[i] = new PersonalLoan(loanAmount, term);
      } else {
        System.out.println("Invalid syntaxe");
        i--;
        continue;
      }
    }

    System.out.println("\nLoan Summary:");
    for (Loan loan : loans) {
      System.out.println(loan);
    }
  }
}