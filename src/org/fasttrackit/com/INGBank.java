package org.fasttrackit.com;

public class INGBank implements BankingInterface{


    private double availableMoney;

    public INGBank(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    @Override
    public double withdraw(double withdrawMoney) {
        if (withdrawMoney<this.availableMoney) {
            this.availableMoney -= withdrawMoney;
        } else {
            System.out.println("You don't have enough money!");
        }
        return this.availableMoney;
    }

    @Override
    public double deposit(double depositMoney) {
        this.availableMoney += depositMoney;
        return this.availableMoney;
    }
}
