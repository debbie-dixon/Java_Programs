package chapter_10_Assignment;

import java.util.Calendar;

class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }
}

abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String ssn, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        this.birthDate = birthDate;
    }

    public abstract double earnings();

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | SSN: " + socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, Date birthDate, double salary) {
        super(firstName, lastName, ssn, birthDate);
        this.weeklySalary = salary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, Date birthDate, double wage, double hours) {
        super(firstName, lastName, ssn, birthDate);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return (hours <= 40) ? (wage * hours) : (40 * wage + (hours - 40) * wage * 1.5);
    }
}

public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new SalariedEmployee("John", "Doe", "111-11-1111", new Date(2, 15, 1990), 800),
            new HourlyEmployee("Jane", "Smith", "222-22-2222", new Date(3, 10, 1985), 20, 45)
        };

        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Get current month

        for (Employee emp : employees) {
            double payroll = emp.earnings();
            if (emp.getBirthDate().getMonth() == currentMonth) {
                payroll += 100.0; // Birthday bonus
            }
            System.out.println(emp + " | Monthly Earnings: $" + payroll);
        }
    }
}
