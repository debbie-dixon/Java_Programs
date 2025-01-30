/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_7.encapsulation;

/**
 *
 * @author hp
 */
public class Person {
    private String name;
    private String age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void display(){
        System.out.printf("Name is: %s%n",getName());
        System.out.printf("Age is: %s%n",getAge());
        System.out.printf("Country is: %s%n",getCountry());
        
    }
    
    public Person(String name, String age,
            String country){
        this.name = name;
        this.age = age;
        this.country = country;
}
}


