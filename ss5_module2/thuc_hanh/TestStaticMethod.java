package ss5_module2.thuc_hanh;
class Student{
    private int rollno;
    private String name;
    private static String college;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static {
        college = "BBDIT";
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }
}
public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111, "Hoang");
        Student student2 = new Student(222, "Hoa");
        Student student3 = new Student(333, "Hoan");
        student1.display();
        student2.display();
        student3.display();

    }

}
