public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public Account(String number, double balance, String name, String email, String phone) {
        System.out.println("Account constructor w/ parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.name = email;
        this.phone = phone;
    }

    public Account(String name, String email, String phone) {
        this("99999", 100.55, name, email, phone);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + ". Your balance is now $" + this.balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds! You only have $" + this.balance + " in your account.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ". Your balance is now $" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
