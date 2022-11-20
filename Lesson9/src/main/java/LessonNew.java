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
        WINTER(-2), SPRING(7), SUMMER(19) {
            public String getDescription() {

                return "Теплое время года";
            }
        }, AUTUMN(7);
        String favoriteSeason;
        final int temp;

        Season(int temp) {
            this.temp = temp;
        }

        public void setFavoriteSeason(Season type) {

            switch (type) {
                case WINTER -> this.favoriteSeason = "Не люблю зиму";
                case SPRING -> this.favoriteSeason = "Не люблю весну";
                case SUMMER -> this.favoriteSeason = "Я люблю лето";
                case AUTUMN -> this.favoriteSeason = "Не люблю осень";
            }

        }

        public String getDescription() {

            return "Холодное время года";
        }

        public String getFavoriteSeason() {

            return favoriteSeason + ". Средняя температура: " + temp;
        }

        @Override
        public String toString() {


            return super.toString() + " Средняя температура: " + temp + " " + getDescription();
        }
    }

    public static void main(String[] args) {

        for (Season enu : Season.values()) {
            System.out.println(enu);
        }
        Season.SUMMER.setFavoriteSeason(Season.SUMMER);
        System.out.println(Season.SUMMER.getFavoriteSeason());
    }
}
