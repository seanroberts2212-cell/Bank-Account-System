public class AccountDemo {
    public static void main(String args[]) {

        SavingsAccount joe = new SavingsAccount("Joe Bloggs",3000, 0.05);
        CheckingAccount mary = new CheckingAccount("Mary Smyth",500, 0.05);

        joe.deposit(300);
        joe.newBalance();
        joe.withdraw(345);
        joe.setInterest(0.01);
        
        mary.withdraw(700);
        mary.setOverdraft(300);
        mary.withdraw(750);
        mary.setCustomerName("Mary Smith");

        System.out.println(mary.getCustomerName());
        joe.printDetails();

        System.out.println("Interest Rate: " + joe.getInterest());
        mary.printDetails();
        System.out.println("Overdraft Limit: " + mary.getOverdraft());


    }
}
