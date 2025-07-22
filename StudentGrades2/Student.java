package StudentGrades2;

public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying like there's no tomorrow! 📚🧠");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
