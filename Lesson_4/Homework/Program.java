package Lesson_4.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program {

    /**
     * Домашняя работа, задача:
     * ========================
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
     * по типу фрукта поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес
     * одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить
     * текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в
     * противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
     * другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
     * апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую
     * перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>(
                Arrays.asList(new Apple(), new Orange(), new Apple(), new Apple(), new Orange()));
        Box box1 = new Box<>();
        Box box2 = new Box<>();
        Box box3 = new Box<>();
        Box[] boxes = { box1, box2, box3 };

        // добавление фруктов в коробки
        for (Box box : boxes) {
            Iterator<Fruit> fruitsIterator = fruits.iterator();
            while (fruitsIterator.hasNext()) {
                if (box.addFruit(fruitsIterator.next())) {
                    fruitsIterator.remove();
                }
            }
            System.out.printf("Box for fruits type %s contains %s and weighs %.2f \n\n", box.getLabel(), box.toString(),
                    box.getWeight());
        }

        // compare
        System.out.printf("Weight of the first box: %.2f \n", box1.getWeight());
        System.out.printf("Weight of the second box: %.2f \n", box2.getWeight());
        System.out.printf("Result of the compare method: %b \n\n", box1.compare(box2));

        // move
        System.out.println("Remove fruits from the first box to the third box");
        box1.moveTo(box3);
        System.out.printf("Box1 for fruits type %s contains %s and weighs %.2f \n", box1.getLabel(), box1.toString(),
                box1.getWeight());
        System.out.printf("Box3 for fruits type %s contains %s and weighs %.2f \n", box3.getLabel(), box3.toString(),
                box3.getWeight());

    }

}
