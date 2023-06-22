package Lesson_7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     * добавить новый тип соискателя.
     * **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * **.3 Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 60000, jobAgency);
        Company google = new Company("Google", 120000, jobAgency);
        Company yandex = new Company("Yandex", 80000, jobAgency);

        Master ivanov = new Master("Иванов", Profession.ДЕВЕЛОПЕР);
        Master petrov = new Master("Петров", Profession.ТЕСТЕР);
        Student sidorov = new Student("Сидоров", Profession.ДИЗАЙНЕР);
        Specialist stepanov = new Specialist("Степанов", Profession.АНАЛИТИК);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(stepanov);

        for (int i = 0; i < 3; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
