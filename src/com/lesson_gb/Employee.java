package com.lesson_gb;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfoEmployee()
    {
        System.out.println("---------------------------");
        System.out.println("FulName: " + this.fullName);
        System.out.println("Postion: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
        System.out.println("---------------------------");
    }
}
