package Lesson_7.observer;

import java.util.Random;

public class Specialist extends Employee implements Observer {

    private static Random random = new Random();

    public String level = "Специалист";

    public Specialist(String name, Profession profession) {
        super(name, profession);
        minSalary = random.nextDouble(50000, 60000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession, level);
    }

}
