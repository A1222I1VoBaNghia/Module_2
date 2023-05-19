package ss16_module2.thuc_hanh;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            while (line == String.valueOf(br.readLine() != null)){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public static void writeFile(String filePath, int max){
        try{
            FileWriter fileWriter =new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(" Gía trị lớn nhất: "+ max);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static int findMaxValue(List<Integer>numbers){
        int max = numbers.get(0);
        for(int i = 0; i< numbers.size(); i++){
            if(max<numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaxValue findMaxValue = new FindMaxValue();
        List<Integer>numbers = FindMaxValue.readFile("text.txt");
        int maxValue = findMaxValue(numbers);
        findMaxValue.writeFile("result.txt", maxValue);

    }
}
