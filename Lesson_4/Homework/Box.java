package Lesson_4.Homework;

import java.util.ArrayList;

public class Box<F extends Fruit> {

    private ArrayList<F> fruits = new ArrayList<F>();
    private float weight;
    private String label;

    // метод для добавления фрукта в коробку
    public boolean addFruit(F fruit) {
        if (label == null || label.equals(fruit.toString())) {
            label = fruit.toString();
            fruits.add(fruit);
            System.out.printf("Put %s in the box \n", fruit.toString());
            return true;
        } else {
            System.out.printf("Can't put %s in the box, the box contains fruits type %s \n", fruit.toString(),
                    label);
            return false;
        }
    }

    // геттеры
    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    public String getLabel() {
        return label;
    }

    // toString
    @Override
    public String toString() {
        return "" + fruits;
    }

    // метод для сравнения двух коробок
    public boolean compare(Box o) {
        return this.getWeight() == o.getWeight();
    }

    // метод для перекладывания
    public void moveTo(Box anotherBox) {
        for (F f : fruits) {
            anotherBox.fruits.add(f);
        }
        anotherBox.label = label;
        label = null;
        fruits.clear();
    }
}
