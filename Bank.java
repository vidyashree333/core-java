class Bank{

    String bankName;
    String branch;
    int employees;
    int customers;
    String manager;
    double balance;
    String accountType;
    boolean hasLoanFacility;
    boolean hasATM;
    int establishedYear;

    public double deposit(double amount) {
        System.out.println("Deposit: " + amount);
        return amount;
    }

    public double withdraw(double amount) {
        System.out.println("Withdraw: " + amount);
        return amount;
    }

    public String openAccount(String name) {
        System.out.println("Account for: " + name);
        return name;
    }

    public double checkBalance(double bal) {
        System.out.println("Balance: " + bal);
        return bal;
    }

    public boolean approveLoan(boolean status) {
        System.out.println("Loan: " + status);
        return status;
    }

    public boolean openATM(boolean status) {
        System.out.println("ATM: " + status);
        return status;
    }

    public String assignManager(String name) {
        System.out.println("Manager: " + name);
        return name;
    }

    public int totalCustomers(int count) {
        System.out.println("Customers: " + count);
        return count;
    }

    public String announceScheme(String scheme) {
        System.out.println("Scheme: " + scheme);
        return scheme;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }
}