package by.tms.model;

public class Engine {
    final private String type;

    public Engine(String type) {
        this.type = type;

    }

    public void engineStart() {
        System.out.println("Запуск двигателя");
    }

    public void engineStop() {
        System.out.println("Остановка двигателя");
    }

}
