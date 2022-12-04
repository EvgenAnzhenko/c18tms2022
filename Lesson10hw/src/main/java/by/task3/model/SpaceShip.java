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
    public boolean checkSystem() throws InterruptedException {
        System.out.println("Началась предстартовая проверка корабля: " + getName());
        boolean check = true;
        for (int i = 0; i < 20; i++) {
            Thread.sleep(200);
            System.out.print(".");
        }
        System.out.println();
        int errors = (int) (Math.random() * 2);
        if (errors > 0) {
            System.out.println("Найдено ошибок: " + errors + ". Запуск шатла невозможен.");
            check = false;
        } else {
            System.out.println("Проверка прошла успешно.");
        }
        return check;
    }

    @Override
    public void engineStart() throws InterruptedException {
        System.out.println("Запускаем двигатели");
        for (int i = 0; i < 15; i++) {
            Thread.sleep(200);
            System.out.print(".");
        }
        System.out.println();
        System.out.println("Двигатели запущены");
    }

    @Override
    public void start() {
        System.out.println("Стартуем");
    }
}
