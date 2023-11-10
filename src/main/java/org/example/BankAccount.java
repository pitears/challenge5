package org.example;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(){
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(){
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setName(){
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setEmail(){
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setPhone(){
        this.customerPhone = customerPhone;
    }

    public BankAccount(){};
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: $" + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawal successful. New balance: $" + this.balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

}
