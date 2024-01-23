package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {

        return "name = " + name + ", hireDate = " + hireDate;
    }

    public String work() {
        return name + " worked";
    }
}
