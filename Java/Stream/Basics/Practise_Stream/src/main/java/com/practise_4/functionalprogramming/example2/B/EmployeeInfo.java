package com.practise_4.functionalprogramming.example2.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by orifjon9 on 3/15/2017.
 */

public class EmployeeInfo {
    public EmployeeInfo() {
    }

    public void sort(List<Employee> emps, final SortMethod method) {

        class EmployeeComparator implements Comparator<Employee> {
            EmployeeComparator() {
            }

            public int compare(Employee e1, Employee e2) {
                if (method == SortMethod.BYNAME && e1.name.compareTo(e2.name) != 0) {
                    return e1.name.compareTo(e2.name);
                }

                return (e1.salary == e2.salary ? 0 : (e1.salary < e2.salary ? -1 : 1));

            }
        }

        Collections.sort(emps, new EmployeeComparator());
    }

    public static void main(String[] args) {
        ArrayList emps = new ArrayList();
        emps.add(new Employee("Joe", 300000));
        emps.add(new Employee("Joe", 200000));
        emps.add(new Employee("Tim", '썐'));
        emps.add(new Employee("Andy", '\uea60'));

        EmployeeInfo ei = new EmployeeInfo();

        ei.sort(emps, SortMethod.BYNAME);
        System.out.println(emps);

        ei.sort(emps, SortMethod.BYSALARY);
        System.out.println(emps);
    }

    static enum SortMethod {
        BYNAME,
        BYSALARY;

        private SortMethod() {
        }
    }
}
