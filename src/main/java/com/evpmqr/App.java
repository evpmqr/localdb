package com.evpmqr;

import com.evpmqr.db.controller.DBController;
import com.evpmqr.db.model.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        DBController controller = new DBController();

        /*Save a new Employee*/
        Employee person = new Employee("Eric", "Test", 2);
        controller.saveEmployee(person);

        /*Gets all Employees*/
        controller.listEmployees();

        System.out.println();
        /*Updates Employee*/
//        Employee updated = new Employee("Eric", "Vue", 42069);
//        controller.updateEmployee(1, updated);

        /*Deletes Employee/Employees from DB*/
//        controller.deleteEmployees(2, 34,35, 67);
//        controller.commit();

        /*findEmployeeWithFirstName example*/
        List<?> results = controller.findEmployeesWithFirstName("Eric");
        results.forEach(System.out::println);

        System.out.println();
        controller.listEmployees();
//        Employee employee = session.find(Employee.class, 1);
//        System.out.println(employee);

        controller.close();
    }
}
