package task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    // TODO: Переработать метод generateEmployee, метод должен генерировать рабочих
    // (Employee) разных типов.

    // метод для добавления сотрудника
    static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        if (random.nextInt(0, 2) == 0) {
            double salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary,
                    random.nextInt(18, 60));
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 600,
                    random.nextInt(160), random.nextInt(18, 60));
        }
    }

    // создаем сотрудников
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        // TODO: Придумать новые состояния для сотрудников. Придумать несколько
        // Comparator'ов для сортировки сотрудников по фамилии + имени или по возрасту и
        // уровню ЗП.

        // Сортировка по зарплате
        Arrays.sort(employees, new SalaryComparator());
        // Сортировка по возрасту
        Arrays.sort(employees, new AgeComporator());
        // Сортировка по фамилии и возрасту
        Arrays.sort(employees, new SurnameAgeComporator());

        // comparable
        // Arrays.sort(employees);

        // распечатка массива
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
