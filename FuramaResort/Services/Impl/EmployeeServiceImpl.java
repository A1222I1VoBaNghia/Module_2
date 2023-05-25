package FuramaResort.Services.Impl;

import FuramaResort.Models.Employee;
import FuramaResort.Services.IEmployeeService;
import FuramaResort.Utils.EmployeeUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements IEmployeeService {
    static ArrayList<Employee> employeeList;
    static {
        employeeList = new ArrayList<>();
        Employee employee = new Employee();
        }

    @Override
    public void display() {
        try {
            for(Employee e: EmployeeUtils.readFileList()){
                System.out.println(e.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addNew() {
        Employee employee = new Employee();
        employee.setIdEmoployee();
        enterPersonalInfomation(employee);
        employeeList.add(employee);
        try {
            EmployeeUtils.writeFileList(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fix() {
        System.out.println("Enter IDName need to fix:");
        Scanner input = new Scanner(System.in);
        String idNameNeedFix = input.nextLine();
        Employee employee = checkIDName(idNameNeedFix);
        if(employee!=null){
            enterPersonalInfomation(employee);
            try {
                    EmployeeUtils.fixFileList(employee);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Not exist IDName you Enter");
        }
    }

    private void enterPersonalInfomation(Employee e) {
        e.setName();
        e.setAge();
        e.setGender();
        e.setNumberPhone();
        e.setEmail();
        e.setLevel();
        e.setIdCode();
        e.setRegency();
        e.setSalary();
    }
    private Employee checkIDName(String idNameNeedFix){
        try {
            for(Employee e: EmployeeUtils.readFileList()){
                if(e.getIdEmoployee().equals(idNameNeedFix)){
                return e;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Enter IDName need to delete:");
        Scanner input = new Scanner(System.in);
        String idNameNeedDel = input.nextLine();
        if(checkIDName(idNameNeedDel)!=null){
            employeeList.remove(checkIDName(idNameNeedDel));
        }
    }


}

