package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ann", "English language");
        Student student = new Student("Tom");
        teacher.evaluate("Tom");
    }
}
