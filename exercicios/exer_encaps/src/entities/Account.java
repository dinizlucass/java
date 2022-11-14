package entities;

public class Account {
    private int number;
    public String holder;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.holder = name;
    }

    public Account(int number, String name, double balance) {
        this.number = number;
        this.holder = name;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return holder;
    }

    public void setName(String name) {
        this.holder = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public String toString(){
        return getNumber() + " " + holder + " "+ getBalance();
    }
}
