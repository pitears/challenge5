package org.example;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("00001234", 10000.0, "Selvia S.", "selvia@gmail.com", "6281200001234");

        System.out.println("Initial Account Information:");
        displayAccountInfo(myAccount);

        myAccount.deposit(100.0);
        myAccount.withdraw(9434.0);
        myAccount.withdraw(15000.0);

        System.out.println("\nUpdated Account Information:");
        displayAccountInfo(myAccount);
    }

    public static void displayAccountInfo(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Customer Email: " + account.getCustomerEmail());
        System.out.println("Customer Phone: " + account.getCustomerPhone());
        System.out.println();
    }
}

