package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher engTeacher = new Teacher("Иван Петрович", "Английский язык");
        Student kirill = new Student("Кирилл Попов");
        String student = kirill.getStudentName();
        engTeacher.evaluate(student);
    }
}
