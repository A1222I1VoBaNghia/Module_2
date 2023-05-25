package FuramaResort.Utils;

import FuramaResort.Models.Customer;
import FuramaResort.Models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerUtils {
    private static final String FILE_PATH = "D:\\Module_2bt\\FuramaResort\\Data\\customer.csv";
    static List<Customer> customerList= new ArrayList<>();
    public static List<Customer> readFileList() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        String line;
        String temp [];
        Customer customer;
        customerList.clear();
        while (((line = bufferedReader.readLine()) != null && !(line.equals("")))){
            temp = line.split(",");
            String idName = temp[0];
            String name = temp[1];
            String age = temp[2];
            String gender = temp[3];
            String numberPhone = temp[4];
            String email = temp[5];
            String idCode = temp[7];
            String rank = temp[8];
            String address = temp[9];
            customer = new Customer(idName,name,age,gender,numberPhone,email,idCode, rank, address);

        }
        bufferedReader.close();
        return customerList;
    }
    public static void writeFileList(Customer customer) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(customer.getIdName()+","+customer.getName()+","+customer.getAge()+","+customer.getGender()+","+ customer.getNumberPhone()+","+ customer.getEmail()+","+customer.getRankCustomer()+","+ customer.getIdCode()+","+ customer.getAddress()+","+"\n");
        bufferedWriter.close();
    }
}

