package FuramaResort.Repository;

import FuramaResort.Models.Employee;
import FuramaResort.Services.Impl.EmployeeServiceImpl;

import java.io.*;

public class EmployeeRepository implements IEmployeeRepository{
    File employeeFile = new File("D:\\Module_2bt\\FuramaResort\\Data\\employee.csv");
    OutputStream os;

    {
        try {
            os = new FileOutputStream(employeeFile);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Employee employee = new Employee();
            oos.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
