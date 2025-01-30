/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_7.encapsulation;

/**
 *
 * @author hp
 */
public class TestClassWork {
    public static void main (String args[]) {
        
        Person person = new Person("Debbie", "18", "Nigeria");
        person.display();
        
        System.out.println();
        
        BankAccount account = new BankAccount("342567", "34267");
        account.accountDetails();
    }
    
}
