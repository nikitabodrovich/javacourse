package day6;
import java.util.Random;
/*
необходимости, а также у преподавателя есть метод evaluate (оценить студента), принимающий в качестве аргумента студента,
 и работающий следующим образом: внутри метода случайным образом генерируется число от 2 до 5, затем в консоль выводится строка:
  "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами, должны быть заменены соответствующими значениями. ОЦЕНКА должна принимать
значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от значения случайно сгенерированного числа.
Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента, передав студента в качестве аргумента метода.
*/

public class Teacher {
    Random rand = new Random();
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    void evaluate(String student){
        String gradeS;
        int grade = rand.nextInt(5)+2;
        switch (grade){
            case 2: gradeS = "неудовлетворительно";
            break;
            case 3: gradeS = "удовлетворительно";
            break;
            case 4: gradeS = "хорошо";
            break;
            default: gradeS = "отлично";
        }

        System.out.println("Преподаватель "+this.name+" оценил студента "+student+" по предмету "+subject+" на оценку "+gradeS);

    }


}

