package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;
    Random random = new Random();

    public Teacher(String teacherName, String subject) {
        name = teacherName;
        this.subject = subject;
    }

    void evaluate(String studentName) {
        int valuation = random.nextInt((5) + 2);
        String val;
        if(valuation == 2){
            val = "Неудовлетворительно";
        }
        else if(valuation == 3) {
            val = "Удовлетворительно";
        }
        else if(valuation == 4) {
            val = "Хорошо";
        }
        else {
            val = "Отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + studentName + " по предмету " + subject + " на оценку " + val);
    }
}
