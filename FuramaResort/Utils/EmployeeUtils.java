package FuramaResort.Utils;

import FuramaResort.Models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
    private static final String FILE_PATH = "D:\\Module_2bt\\FuramaResort\\Data\\employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    public static List<Employee> readFileList() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        String line;
        String temp [];
        Employee employee;
        employeeList.clear();
        while (((line = bufferedReader.readLine()) != null && !(line.equals("")))){
            temp = line.split(",");
            String idEmployee = temp[0];
            String name = temp[1];
            String age = temp[2];
            String gender = temp[3];
            String numberPhone = temp[4];
            String email = temp[5];
            String level = temp[6];
            String idCode = temp[7];
            String regency = temp[8];
            double salary = Double.parseDouble(temp[9]);
            employee = new Employee(idEmployee,name,age,gender,numberPhone,email,level,idCode, regency, (int) salary);
            employeeList.add(employee);
        }
        bufferedReader.close();
        return employeeList;
    }
    public static void writeFileList(Employee employee) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(employee.getIdEmoployee()+","+employee.getName()+","+employee.getAge()+","+employee.getGender()+","+ employee.getNumberPhone()+","+ employee.getEmail()+","+employee.getLevel()+","+ employee.getIdCode()+","+ employee.getRegency()+","+ employee.getSalary()+"\n");
        bufferedWriter.close();
    }
    public static void fixFileList(Employee employee) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(employee.getIdEmoployee()+","+employee.getName()+","+employee.getAge()+","+employee.getGender()+","+ employee.getNumberPhone()+","+ employee.getEmail()+","+employee.getLevel()+","+ employee.getIdCode()+","+ employee.getRegency()+","+ employee.getSalary()+"\n");
        bufferedWriter.close();
    }
}
