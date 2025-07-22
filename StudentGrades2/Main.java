package StudentGrades2;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("habiba Elnahas", 19, 3.9);
        Student s2 = new Student("Tasneem Fathi", 20, 4.0);


        s1.displayInfo();
        s1.study();

        s2.displayInfo();
        s2.study();

        s1.setGpa(4.0);
        System.out.println(s1.getName() + "'s updated GPA: " + s1.getGpa());
    }
}
