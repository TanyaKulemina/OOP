package Lesson_6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно
     * соответствовать
     * принципу SRP.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        Input input = new Input();
        SaveTo saveTo = new SaveTo();
        input.inputFromConsole(order);
        saveTo.saveToJson(order);
    }

}
