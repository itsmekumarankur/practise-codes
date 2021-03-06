package com.practise_4.functionalprogramming.example2.B;

/**
 * Created by orifjon9 on 3/15/2017.
 */

public class Employee {
    String name;
    int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(this.name);
        sb.append(" salary: ");
        sb.append(this.salary + ">");
        return sb.toString();
    }
}
