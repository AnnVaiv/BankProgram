import controller.Bank;
import entity.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Anna", "V", 32100123, 4321, 500);
        Bank bank = new Bank();


        bank.checkUser(user);


    }

}

