package accounts;

public class PersonAccounts {

    private String name;
    private String surname;
    private String gender;
    private int accountNumber;
    private float income;
    private float outcome;


    public PersonAccounts(String name, String surname, String gender, int accountNumber, double income, double outcome) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.accountNumber = accountNumber;
        this.income = (float) income;
        this.outcome = (float) outcome;
    }

    public String getUserInformation() {
        return "User: " + name + " " + surname +
                "\nGender: " + gender +
                "\nAccount number: " + accountNumber;
    }

    public void  calculateBalance() {//ex - public string calculateBalance()
        float balance = this.income - this.outcome;
        if (balance >= 0) {
            System.out.println("Account balance : " + balance);
            }else{
            System.out.println("Account balance : " + balance+
                    "\nSTOP SPENDING MONEY!!!");
        }

        //return "";


    }
}