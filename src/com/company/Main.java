package com.company;
public class Main {


    public static void main(String[] args) {
        BankAccount bank = new  BankAccount();
        bank.deposit( 10000);
         bank.getAmount();

         while (true) {
             try {
                 bank.withdrow(6000);
             } catch (LimiException le) {
                 System.out.println("U vas ne dostatochno sredstv" + le.getRemaininAmount());
                 System.out.println(le.getRemaininAmount());
                 break;
             }
         }





}