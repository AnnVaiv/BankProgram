import controller.Bank;
import entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Anna", "V", 32100123, 4321, 500);
        Bank bank = new Bank();
        String toDo = "";

        bank.checkUser(user);
        Scanner input = new Scanner(System.in);

        while (!toDo.equals("q")) {
            System.out.println(bank.whatNext());
            toDo = input.nextLine();
            switch (toDo) {
                case "b":
                    System.out.println(bank.getBalance());
                    break;
                case "c":
                    System.out.println(bank.getCredit());
                    break;
                case "d":
                    System.out.println(bank.getDebit());
                    break;
                case "q":
                    System.out.println(bank.quit());
                    break;
                default:
                    System.out.println("Something went terrible wrong.");
                    break;
            }
        }
    }
}

