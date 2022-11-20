public class LessonNew {


//    Задача1: Времена года
// * 1) Создать перечисление(enum), содержащее названия времен года.
//            * 2) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
// * 3) Создать метод, который принимает на вход переменную созданного вами enum типа.
//            *  Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
//            * 4) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//            * 5) Добавить конструктор принимающий на вход среднюю температуру.
// * 6) Создать метод getDescription, возвращающий строку “Холодное время года”.
//            *  Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//            * 7) В цикле распечатать все времена года, среднюю температуру и описание времени года.


    enum Season {
        WINTER(-2, "Winter"), SPRING(7, "Spring"), SUMMER(19, "Summer") {
            public String getDescription() {

                return "Теплое время года";
            }
        }, AUTUMN(7, "Autumn");
        final String favoriteSeason;
        final int temp;


        Season(int temp, String favoriteSeason) {
            this.temp = temp;
            this.favoriteSeason = favoriteSeason;
        }

        public void resultFavoriteSeason() {

            switch (favoriteSeason) {
                case "Winter" -> System.out.print("Не люблю зиму");
                case "Spring" -> System.out.print("Не люблю весну");
                case "Summer" -> System.out.print("Я люблю лето");
                case "Autumn" -> System.out.print("Не люблю осень");
            }

        }

        public String getDescription() {

            return "Холодное время года";
        }


        @Override
        public String toString() {
            return super.toString() + " Средняя температура: " + temp + " " + getDescription();
        }
    }

    public static void main(String[] args) {
        for (Season result : Season.values()) {
            System.out.println(result);
        }

        Season.WINTER.resultFavoriteSeason();

    }
}
