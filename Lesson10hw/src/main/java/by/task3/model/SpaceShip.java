package by.task3.model;

import by.task3.service.IStart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class SpaceShip implements IStart {
    private String name;

    @Override
    public boolean checkSystem() {
        System.out.println("Началась предстартовая проверка корабля: " + getName());
        boolean check = true;
        sleep();
        System.out.println();
        int errors = (int) (Math.random() * 2);
        if (errors > 0) {
            System.out.println("Найдено ошибок: " + errors + ".");
            check = false;
        } else {
            System.out.println("Проверка прошла успешно.");
        }
        return check;
    }

    @Override
    public void engineStart() {
        System.out.println("Запускаем двигатели");
        sleep();
        System.out.println();
        System.out.println("Двигатели запущены");
    }

    private static void sleep() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ignored) {
            }
            System.out.print(".");
        }
    }

    @Override
    public void start() {
        System.out.println("Стартуем");
    }
}
