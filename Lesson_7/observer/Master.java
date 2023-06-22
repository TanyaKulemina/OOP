package Lesson_7.observer;

import java.util.Random;

public class Master extends Employee implements Observer {

    private static Random random = new Random();

    public String level = "Мастер";

    public Master(String name, Profession profession) {
        super(name, profession);
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession, level);
    }
    // if (vacancyProfession.equals(profession)) {
    // if (minSalary <= salary) {
    // System.out.printf("Мастер %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
    // name, minSalary, nameCompany, salary);
    // minSalary = salary;
    // } else {
    // System.out.printf("Мастер %s (%f) >>> Я найду работу получше! (%s - %f)\n",
    // name, minSalary, nameCompany, salary);
    // }
    // } else {
    // System.out.printf("Мастер %s не согласен на вакансию %s, он - %s\n", name,
    // vacancyProfession.toString(),
    // profession.toString());
    // }
    // }

}
