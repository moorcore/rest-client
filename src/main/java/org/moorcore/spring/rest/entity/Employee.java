package org.moorcore.spring.rest.entity;

public class Employee {

    private int id;

    private String name;

    private String surName;

    private String department;

    private int salary;

    public Employee() {
    }

    public Employee(String name, String surName, String department, int salary) {
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int id, String name, String surName, String department, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", department = '" + department + '\'' +
                ", salary = " + salary +
                '}';
    }
}
