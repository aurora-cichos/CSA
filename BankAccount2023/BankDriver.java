class BankDriver {
  
  public static void main(String[] args) {
    BankAccount nicksAcct = new BankAccount("Nick", 450, 550);
    BankAccount carolsAcct = new BankAccount("Carol", 600, 700);
    nicksAcct.printReport();
    carolsAcct.printReport();
    System.out.println("Total money in all accounts: $" + (nicksAcct.getCheckMoney() + nicksAcct.getSaveMoney() + carolsAcct.getCheckMoney() + carolsAcct.getSaveMoney()));
    nicksAcct.makeCheckingDeposit(100);
    nicksAcct.printReport();
    int temp = nicksAcct.getCheckMoney();
    nicksAcct.makeCheckingWithdrawal(temp);
    carolsAcct.makeCheckingDeposit(temp);
    temp = nicksAcct.getSaveMoney();
    nicksAcct.makeSavingsWithdrawal(temp);
    carolsAcct.makeCheckingDeposit(temp);
    nicksAcct.printReport();
    carolsAcct.printReport();
  }
}
