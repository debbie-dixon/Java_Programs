/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_7.encapsulation;

/**
 *
 * @author hp
 */
public class BankAccount {
    
    private String accountNumber;
    private String balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    
     public void accountDetails(){
        System.out.printf("Account number is: %s%n",getAccountNumber());
        System.out.printf("Balance is: %s%n",getBalance());   
    }
    
      public BankAccount(String accountNumber, String balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
}
}
