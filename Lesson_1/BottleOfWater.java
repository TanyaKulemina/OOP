package Lesson_1;

//создаем класс наследник
public class BottleOfWater extends Product {
    // добавляем поле
    private double volume;

    // геттер и сеттер
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    // конструктор
    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    // метод для вывода на экран
    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f [объем: %f]", brand, name, price, volume);
    }
}
