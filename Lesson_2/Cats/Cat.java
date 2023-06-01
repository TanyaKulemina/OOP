package Cats;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {
        setFull(true);
        System.out.printf("%s - поел %d \n", getName(), getAppetite());
    }

    public int getAppetite() {
        return appetite;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isFull() {
        return full;
    }

    public String getName() {
        return name;
    }

}
