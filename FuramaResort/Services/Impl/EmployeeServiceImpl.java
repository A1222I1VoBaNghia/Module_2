package FuramaResort.Services;

import FuramaResort.Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl extends Employee implements EmployeeService{
    static Employee employee = new EmployeeServiceImpl();
    static List <Employee> employeeArrayList = new ArrayList<>();
    public EmployeeServiceImpl(String idName, String name, int age, String gender, int idCode, int numberPhone, String email) {
        super(idName, name, age, gender, idCode, numberPhone, email);
    }

    public EmployeeServiceImpl(String idName, String name, int age, String gender, int idCode, int numberPhone, String email, String level, String regency, int salary) {
        super(idName, name, age, gender, idCode, numberPhone, email, level, regency, salary);
    }

    public EmployeeServiceImpl() {
    }

    public static void displayEmploye(){

    }
    public static void addEmployee(){
        System.out.println("*****Add Employee*****");
        employee.setIdName();
        employee.setName();
        employee.setAge();
        employee.setGender();
        employee.setIdCode();
        employee.setNumberPhone();
        employee.setEmail();
        employee.setLevel();
        employee.setRegency();
        employee.setSalary();
        employeeArrayList.add(employee);
        System.out.println(employee.toString());
    }
    public static void fixEmployee(String idName){
       for(Employee ignored : employeeArrayList){
            if(employee.getIdName().equals(idName)){
            System.out.println("*****Fix Employee*****");
            employee.setName();
            employee.setAge();
            employee.setGender();
            employee.setIdCode();
            employee.setNumberPhone();
            employee.setEmail();
            employee.setLevel();
            employee.setRegency();
            employee.setSalary();
            employeeArrayList.add(employee);
        }else {
            System.out.println("IDName "+ idName+ " not exist!");
        }}

    }

    public static void main(String[] args) {
        addEmployee();
        fixEmployee("A123");

    }
}

