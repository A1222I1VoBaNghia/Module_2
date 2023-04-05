package ss5_module2.bai_tap;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "CO2";
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
