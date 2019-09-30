package com.company;

public class LimiException extends Exception {

    private double remaininAmount;

    public LimiException(String message, double remaininAmount) {
        super(message);
        this.remaininAmount = remaininAmount;

    }

    public double getRemaininAmount() {
        return remaininAmount;

    }


}
