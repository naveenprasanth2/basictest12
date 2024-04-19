package org.example.annotations;

public record EmployeeRecord(String name, int employeeNumber) {
    public static String department;

    public EmployeeRecord {
        if (name.equals("suresh kumar")) {
            throw new IllegalArgumentException("Please enter the right name");
        }
    }


    public static void setDepartment(String department) {
        EmployeeRecord.department = department;
    }


}
