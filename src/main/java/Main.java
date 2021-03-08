import accounts.PersonAccounts;

/*
* Bonus: Write a program for a bank where users can register,
* user class should have basic information like account number,
* balance, name, gender etc.
Bank class should be able to accept a single user at a time,
* and have method to credit and debit the user as well as show
* the user balance.
Should be method to replace existing user with new one in bank.
All clases should be used from main class

*/
public class Main {
    public static void main(String[] args){
        PersonAccounts personAccounts1=new PersonAccounts("Wilma","Flinston","female",10000001,364.25,499.62);
        PersonAccounts personAccounts2=new PersonAccounts("Fred","Flinston","male",10000002,700.50,368.52);
        PersonAccounts personAccounts3=new PersonAccounts("Barney","Rubble","male",10000003,600.23,648.32);
        PersonAccounts personAccounts4=new PersonAccounts("Berry","Rubble","female",10000004,555.55,300.21);



        System.out.println(personAccounts1.getUserInformation());
        System.out.println(personAccounts1.calculateBalance());
        System.out.println(personAccounts2.getUserInformation()+"\n"+personAccounts2.calculateBalance()+"\n");
        System.out.println(personAccounts3.getUserInformation()+"\n"+personAccounts3.calculateBalance()+"\n");
        System.out.println(personAccounts4.getUserInformation()+"\n"+personAccounts4.calculateBalance()+"\n");




    }
}
