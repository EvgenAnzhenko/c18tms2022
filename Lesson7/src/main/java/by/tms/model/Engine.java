package by.tms.model;

public class Engine {
    public Engine(String type) {
        this.type = type;

    }

    final private String type;

    public void engineStart() {
        System.out.println("Запуск двигателя");
    }

    public void engineStop() {
        System.out.println("Остановка двигателя");
    }

}
