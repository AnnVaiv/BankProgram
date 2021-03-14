package controller;

import entity.User;

import java.util.Scanner;

public class Bank {
    private User user;
    //int enterAccountNumber =0;
    //int enterPin=0;
    int checkTime = 1;
    private double testCredit;

    public void checkUser(User user) {
        this.user = user;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to JavaBank!" + "Please enter your account number (hint: 32100123):");
        int enterAccountNumber = input.nextInt();
        System.out.println("Please enter your PIN number (hint: 4321):");
        int enterPin = input.nextInt();
        if (enterAccountNumber == 32100123 && enterPin == 4321) {
            System.out.println(user.getUserInformation());
        } else if (checkTime < 3) {
            System.out.println("Wrong account number and/or PIN. \nTry again!");
            checkTime++;
            checkUser(user);
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


    public double getTestCredit(){
        return this.testCredit;
    }
    public void setTestCredit(double testCredit){
        this.testCredit=testCredit;
    }


    public String getCredit() {
        double amountC;
        //return "Credit";
        System.out.println("Insert wanted credit amount (max 1000 EUR):");
        Scanner input = new Scanner(System.in);
        amountC = input.nextDouble();
        //double testCredit=0;

        if (testCredit<=1000 && amountC<=1000) {
            double newBalance = user.getBalance() + amountC;
            this.user.setBalance(newBalance);
            double newTestCredit = getTestCredit() + amountC;
            this.setTestCredit(newTestCredit);
            //this.testCredit=testCredit-amountC;
            return amountC + " added to your balance successfully.";
            //Bank.setTestCredit(getTestCredit()+amountC);
        } else {
            return amountC + " You are not qualified to received this credit.";
        }
    }

    public String getDebit() {
        double amountD = 0d;
        //getBalance();
        //return "Debit";
        System.out.println("Insert wanted debit amount:");
        Scanner input = new Scanner(System.in);
        amountD = input.nextDouble();

        if (user.getBalance() - amountD >= 0) {
            double newBalance = user.getBalance() - amountD;
            this.user.setBalance(newBalance);
            return amountD + " taken from your balance successfully.";
        } else {
            return amountD + " You cant afford it.";

            //double newBalance = user.getBalance();
        }
    }

    public String quit() {
        return "Thank you for using JavaBank! See you next time!";

    }
}


