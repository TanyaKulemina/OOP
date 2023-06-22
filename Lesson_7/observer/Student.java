package Lesson_7.observer;

import java.util.Random;

public class Student extends Employee implements Observer {

    private static Random random = new Random();
    public String level = "Студент";

    public Student(String name, Profession profession) {
        super(name, profession);
        minSalary = random.nextDouble(10000, 20000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession, level);
    }
}
