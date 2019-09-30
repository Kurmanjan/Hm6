package com.company;


public class BankAccount {
    public double amount;

    public double getAmount() {
        System.out.println("остаток составляет" + amount);
        return amount;
    }
    double deposit(double sum) {
        return amount+=sum;
    }

    public double withdrow(double sum) throws LimiException{
        if (sum > amount) {
            throw new LimiException(
                    "Извините изымаемае сумма превышае остаток на вашем счете",
                    amount);
        }

        amount -=sum;
        return amount;

    }

    }


