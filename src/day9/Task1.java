package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Michael", "Ghostbusters");
        Teacher teacher = new Teacher("Ivan Petrovich", "Chemistry");
        student.getGroupName();
        teacher.getSubjectName();
        student.printInfo();
        teacher.printInfo();
    }
}
