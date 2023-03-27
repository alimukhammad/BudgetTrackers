public class BudgetTracker {
    private double income;
    private double expenses;
    private double balance;

    public BudgetTracker(double initialBalance) {
        balance = initialBalance;
    }

    public void addIncome(double amount) {
        income += amount;
        balance += amount;
    }

    public void addExpense(double amount) {
        expenses += amount;
        balance -= amount;
    }

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getBalance() {
        return balance;
    }

    public void generateReport() {
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + expenses);
        System.out.println("Balance: " + balance);
    }
}
