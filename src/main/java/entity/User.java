package entity;

public class User {
    private String name;
    private String surname;
    private int accountNumber;
    private double balance;
    private int pin;

    public User(String name, String surname, int accountNumber, int pin, double balance) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;

    }

    public String getUserInformation() {
        return "Welcome to JavaBank!" +
               "\nUser: " + name + " " + surname +
               "\nAccount number: " + accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*public void  calculateBalance() {//ex - public string calculateBalance()
        double balance = this.startBalance;
        if (balance >= 0) {
            System.out.println("Account balance : " + balance);
            }else{
            System.out.println("Account balance : " + balance+
                    "\nSTOP SPENDING MONEY!!!");
        }

        //return "";*/


}