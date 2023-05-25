package FuramaResort.Models;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public abstract class Person {
    Scanner input = new Scanner(System.in);
    private String idName;
    private String name;
    private String age;
    private String gender;
    private String  idCode;
    private String numberPhone;
    private String email;

    public Person(String idName, String name, String age, String gender, String idCode, String numberPhone, String email) {
        this.idName = idName;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idCode = idCode;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public Person() {

    }

    public Person(String name, String age, String gender, String idCode, String numberPhone, String email) {

    }

    public String getIdName() {
        return idName;
    }

    public void setIdName() {
        do{
            System.out.println("Enter your IDName");
            this.idName = input.nextLine();
        }while (!this.idName.matches("^KH-[0-9]{4}$"));
    }

    public String getName() {
        return name;
    }

    public void setName() {
        do{
            System.out.println("Enter your Name:");
            this.name = input.nextLine();
        }while (!this.name.matches("^(([a-zA-Z\\sÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]*)([a-zA-Z\\s\\'ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]*)([a-zA-Z\\sÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]))*$"));
    }

    public String getAge() {
        return age;
    }

    public void setAge() {
       do{
           System.out.println("Enter your age:\n"+
                   "(15/10/95)");
           this.age = input.nextLine();
       }while (!this.age.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$"));
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        String choice;
       do{
           System.out.println("Chose your Gender:");
           System.out.println("1. Male");
           System.out.println("2. Female");
           System.out.println("3. Other");
           choice = input.nextLine();
           switch (choice){
               case "1":
                   this.gender = "Male";
                   break;
               case "2":
                   this.gender = "Female";
                   break;
               case "3":
                   this.gender = "Other";
                   break;
           }
       }while (!choice.matches("[1-3]"));
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode() {
        do{
            System.out.println("Enter IDCode");
            this.idCode = input.nextLine();
        }while (!this.idCode.matches("^[0-9]{9,12}$"));
    }
    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone() {
       do{
           System.out.println("Enter your numberphone: ");
           this.numberPhone = input.nextLine();
       }while (this.numberPhone.matches("^0+[23789]{1}+[0-9]{8}"));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
       do{
           System.out.println("Enter your Email: ");
           this.email = input.nextLine();
       }while (!this.email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+.+.[a-zA-Z]{1,4}"));
    }

    @Override
    public String toString() {
        return
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", idCode=" + idCode +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'';
    }
}
