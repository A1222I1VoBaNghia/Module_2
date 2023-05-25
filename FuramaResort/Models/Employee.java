package FuramaResort.Models;

import static java.lang.Integer.parseInt;

public class Employee extends Person{
    public Employee( String name, String age, String gender, String idCode, String numberPhone, String email) {
        super(name, age, gender, idCode, numberPhone, email);
    }
    private String level;
    private String regency;
    private double salary;
    private String idEmoployee;

    public Employee(String idName, String name, String age, String gender, String idCode, String numberPhone, String email, String level, String regency, int salary) {
        super(idName, name, age, gender, idCode, numberPhone, email);
        this.level = level;
        this.regency = regency;
        this.salary = salary;
    }

    public Employee() {
        super();
    }
    public String getIdEmoployee(){
        return this.idEmoployee;
    }
    public void setIdEmoployee(){
        do{
            System.out.println("Enter your IDName");
            this.idEmoployee = input.nextLine();
        }while (!this.idEmoployee.matches("^NV-[0-9]{4}$"));
    }

    public String getLevel() {
        return level;
    }

    public void setLevel() {
        String choice;
        do{
            System.out.println("Chose your level: ");
            System.out.println("1. High school");
            System.out.println("2. Colleague");
            System.out.println("3. University");
            System.out.println("4. Master");
            choice = input.nextLine();
            switch (choice){
                case "1":
                    this.level = "High school";
                    break;
                case "2":
                    this.level = "Colleague";
                    break;
                case "3":
                    this.level = "University";
                    break;
                case "4":
                    this.level = "Master";
                    break;
            }
        }while (!choice.matches("[1-4]"));
    }

    public String getRegency() {
        return regency;
    }

    public void setRegency() {
        String choice;
        do {
            System.out.println("Chose your regency: ");
            System.out.println("1. Receptionist");
            System.out.println("2. Staff");
            System.out.println("3. Expert");
            System.out.println("4. Supervisor");
            System.out.println("5. Manager");
            System.out.println("4. Director");
            choice = input.nextLine();
            switch (choice){
                case "1":
                    this.regency = "Receptionist";
                    break;
                case "2":
                    this.regency = "Staff";
                    break;
                case "3":
                    this.regency = "Expert";
                    break;
                case "4":
                    this.regency= "Supervisor";
                    break;
                case "5":
                    this.regency = "Manager";
                    break;
                case "6":
                    this.regency = "Director";
                    break;
            }
        }while (!choice.matches("[1-6]"));

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        try{
            do{
            System.out.println("Enter Salary:");
            this.salary = Double.parseDouble(input.nextLine());
            }while (this.salary<0);
        } catch (NumberFormatException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +"IDEmployee ="+ idEmoployee + super.toString()+
                " level='" + level + '\'' +
                ", regency='" + regency + '\'' +
                ", salary=" + salary +
                '}';
    }
}
