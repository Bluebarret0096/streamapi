package com.streamapi.demo;

import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private Double salary;
    private List<String> projects;

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }
    public Employee(String firstName, String lastName, Double salary, List < String > projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.projects = projects;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public List<String> getProjects() {
        return projects;



    }

}
