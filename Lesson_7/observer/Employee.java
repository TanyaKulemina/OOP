package Lesson_7.observer;

import java.util.Random;

public abstract class Employee {
    protected static Random random = new Random();

    protected String name;
    protected double minSalary;
    protected Profession profession;
    // protected String level;

    public Employee(String name, Profession profession) {
        this.name = name;
        minSalary = random.nextDouble(80000, 100000);
        this.profession = profession;
    }

    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession, String level) {
        if (vacancyProfession.equals(profession)) {
            if (minSalary <= salary) {
                System.out.printf("%s %s (%f) >>> Мне нужна эта работа! (%s - %f)\n", level,
                        name, minSalary, nameCompany, salary);
                minSalary = salary;
            } else {
                System.out.printf("%s %s (%f) >>> Я найду работу получше! (%s - %f)\n", level,
                        name, minSalary, nameCompany, salary);
            }
        } else {
            System.out.printf("%s %s не согласен на вакансию %s, он - %s\n", level, name, vacancyProfession.toString(),
                    profession.toString());
        }
    }

}
