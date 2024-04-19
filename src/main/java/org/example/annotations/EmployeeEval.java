package org.example.annotations;

import java.lang.ref.Cleaner.Cleanable;

public class EmployeeEval implements Cleanable {
    public void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("naveen", 1);
        EmployeeRecord employeeRecord1 = new EmployeeRecord("suresh", 1);
        EmployeeRecord.setDepartment("summa");
//        System.out.println(EmployeeRecord.department);
        System.out.println(employeeRecord1);
        clean();
    }

    @Override
    public void clean() {
        System.out.println("everything is done");
    }
}
