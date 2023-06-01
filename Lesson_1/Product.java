package Lesson_1;

public class Product {
    // Задаем поля
    protected String name;
    protected String brand;
    protected double price;

    // Три конструктора один в другом
    public Product() {
        this("product", 100);
    }

    public Product(String name, double price) {
        this("noname", name, price);
    }

    public Product(String name, String brand, double price) {
        if (brand == null || brand.length() < 4) {
            this.brand = "noname";
        } else {

            this.brand = brand;
        }
        if (name == null || name.length() < 4) {
            this.name = "product";
        } else {
            this.name = name;
        }
        checkPrice(price);
    }

    // Метод для проверки цены
    private void checkPrice(double price) {
        if (price <= 0) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    // Геттер и сеттер для цены

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    // Вывод на экран
    public String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }

}
