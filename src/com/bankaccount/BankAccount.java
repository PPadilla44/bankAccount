package com.bankaccount;

import java.util.Random;

public class BankAccount {

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    private static int totalAccounts = 0;
    private static double totalMoney = 0;


    private String randomAccountNumber(){

        String newAccountNumber = "";
        Random generator = new Random();

        for(int i = 0; i < 10; i++) {
            newAccountNumber += generator.nextInt(10);
        }

        return newAccountNumber;
    }


    public BankAccount(){
        this.accountNumber = randomAccountNumber();
        totalAccounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.accountNumber = randomAccountNumber();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalAccounts++;
        totalMoney += checkingBalance + savingsBalance;
    }


    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }


    public void depositToCheckings(double amount){
        checkingBalance += amount;
        totalMoney += amount;
    }

    public void depositToSavings(double amount){
        savingsBalance += amount;
        totalMoney += amount;
    }


    public void withdrawalFromCheckings(double amount) {
        if(checkingBalance <= 0) {
            System.out.println("Insufficient Funds");
            return;
        }
        checkingBalance -= amount;
        totalMoney -= amount;
    }

    public void withdrawalFromSavings(double amount) {
        if(savingsBalance <= 0) {
            System.out.println("Insufficient Funds");
            return;
        }
        savingsBalance -= amount;
        totalMoney -= amount;
    }


    public void showAccountInfo(){
        System.out.println("Account Number: " + accountNumber + "\nCheckings:\t" + checkingBalance + "\nSavings:\t" + savingsBalance);
    }

}
