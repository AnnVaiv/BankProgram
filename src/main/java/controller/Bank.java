package controller;

import entity.User;

import java.util.Scanner;

public class Bank {
    private User user;
    //int enterAccountNumber =0;
    //int enterPin=0;
    int checkTime = 1;
    private double maxCredit=1000d;
    String toDo = "";
    Scanner input = new Scanner(System.in);


    public void checkUser(User user) {
        this.user = user;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to JavaBank!" + "Please enter your account number (hint: 32100123):");
        int enterAccountNumber = input.nextInt();
        System.out.println("Please enter your PIN number (hint: 4321):");
        int enterPin = input.nextInt();
        if (enterAccountNumber == 32100123 && enterPin == 4321) {
            System.out.println(user.getUserInformation());
            showMenu();
        } else if (checkTime < 3) {
            checkTime++;
            checkUser(user);
            System.out.println("Wrong account number and/or PIN. \nTry again! Your account will be block after "+ (3-checkTime) + "failed attempt to log in.");
        } else {
            System.out.println("Wrong account number and/or PIN. \nAccount blocked!");
        }
    }

    public String whatNext() {
        return "What you want to do? See balance/Get credit/Get debit/Quit\nb/c/d/q ";

    }

    public String getBalance() {
        double newBalance = user.getBalance();
        return "Current balance: " + newBalance;
    }


    public double getMaxCredit(){
        return this.maxCredit;
    }
    public void setMaxCredit(double maxCredit){
        this.maxCredit=maxCredit;
    }


    public String getCredit() {
        double amountC;
        //double maxCredit=1000d;

        //return "Credit";
        System.out.println("Insert wanted credit amount (max "+maxCredit+" EUR):");
        Scanner input = new Scanner(System.in);
        amountC = input.nextDouble();

        if (maxCredit-amountC<=1000 && maxCredit-amountC>=0 && amountC>=0) {
            double newBalance = user.getBalance() + amountC;
            this.user.setBalance(newBalance);
            getMaxCredit();
            double newTestCredit = getMaxCredit() - amountC;
            this.setMaxCredit(newTestCredit);
            //this.testCredit=testCredit-amountC;
            return amountC + " added to your balance successfully.";
            //Bank.setTestCredit(getTestCredit()+amountC);
        } else {
            if (amountC<0){
                return "The JavaBank suggests not to attempt committing bank fraud!";
            }
            return amountC + " You are not qualified to received this credit.";
        }
    }

    public String getDebit() {
        double amountD = 0d;
        //getBalance();
        //return "Debit";
        System.out.println("Insert wanted debit amount (max "+user.getBalance()+" EUR):");
        Scanner input = new Scanner(System.in);
        amountD = input.nextDouble();

        if (user.getBalance() - amountD >= 0 && amountD>=0) {
            double newBalance = user.getBalance() - amountD;
            this.user.setBalance(newBalance);
            return amountD + " taken from your balance successfully.";
        } else {
            if (amountD<0){
                return "The JavaBank suggests not to attempt committing bank fraud!";
            }
            else
                return amountD + " You cant afford it.";

            //double newBalance = user.getBalance();
        }
    }

    public String quit() {
        return "Thank you for using JavaBank! See you next time!";

    }

    public void showMenu() {
        while (!toDo.equals("q")) {
            System.out.println(whatNext());
            toDo = input.nextLine();
            switch (toDo) {
                case "b":
                    System.out.println(getBalance());
                    break;
                case "c":
                    System.out.println(getCredit());
                    break;
                case "d":
                    System.out.println(getDebit());
                    break;
                case "q":
                    System.out.println(quit());
                    break;
                default:
                    System.out.println("Something went terrible wrong.");
                    break;
            }
        }
    }
}


