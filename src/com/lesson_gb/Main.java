package com.lesson_gb;

public class Main {

    public static void main(String[] args) {

        int ageCondtion = 40;
        int cntEmployee = 5;

        Employee[] employeeArray = new Employee[cntEmployee];

        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivanov@mail.ru", "2389571293", 30000, 45);
        employeeArray[1] = new Employee("Petrov Aleksandr Andreevich", "Engineer", "petrov@mail.ru", "423432423", 34325, 25);
        employeeArray[2] = new Employee("Sidorov Ivan Aleksandrovich", "Teacher", "sidorov@mail.ru", "325352352", 53452, 35);
        employeeArray[3] = new Employee("Plokhov Stepan Vadimovich", "Washer", "plokhov@mail.ru", "4534254", 452346, 54);
        employeeArray[4] = new Employee("Filipova Alina Ivanovna", "Seller", "filipova@mail.ru", "53246342", 53246, 23);

        for (Employee employee : employeeArray)
        {
            if (employee.age > ageCondtion) employee.printInfoEmployee();
        }
    }
}
