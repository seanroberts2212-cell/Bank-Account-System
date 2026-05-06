public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(String customerName, double balance, double interest) {
        super(customerName, balance);
        this.interest = interest;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }
    public void newBalance() {
        balance = balance + (balance * interest);  
    }
}
