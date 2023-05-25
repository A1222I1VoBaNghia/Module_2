package FuramaResort.Repository;

import FuramaResort.Models.Employee;
import FuramaResort.Utils.EmployeeUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    static List<Employee> employeeList = new ArrayList<>();

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        EmployeeRepository.employeeList = employeeList;
    }

    public static List<Employee> readFile() throws IOException {
        employeeList = EmployeeUtils.readFileList();
        return employeeList;
    }
    public static void writeFile(Employee employee) throws IOException {
        EmployeeUtils.writeFileList(employee);
    }
}
