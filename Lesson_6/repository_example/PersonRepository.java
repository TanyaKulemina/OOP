package Lesson_6.repository_example;

import java.util.List;

public interface PersonRepository extends Repository<Person, Integer> {

    List<Person> getByAge(int age);

}
