


public class Bouquet {

    public static Flower randomFlower(Flower[] ints) {    //Рандомно выбираем цветы для загрузки букета

        return ints[(int) (Math.random() * ints.length)];

    }

    public static Bouquet[] creatBouquet(Flower[] flowers) {        //Метод для создания букета
        int random = (int) (1 + Math.random() * 21);               // Рандомно выбрали сколько будет цветов в букете
        if (random % 2 == 0) {
            random++;
        }
        Bouquet[] bouquet = new Bouquet[random];
        for (int j = 0; j < random; j++) {
            bouquet[j] = randomFlower(flowers);
        }
        return bouquet;
    }

    public static int price(Bouquet[] bouquet) {  //Метод для подсчета стоимости букета
        int price = 0;
        for (int i = 0; i < bouquet.length; i++) {
            price += ((Flower) bouquet[i]).getCost();
        }

        return price;
    }

    public static void main(String[] args) {
        int amount = 0;
        Flower[] flowers = {new Flower("Peony", 8), new Flower("Rose", 10), new Flower("Tulip", 7), new Flower("Chamomile", 5)};

        Bouquet[][] allBouquet = new Bouquet[5][];   //Создаем 5 букетов
        for (int i = 0; i < 5; i++) {
            allBouquet[i] = creatBouquet(flowers);
        }

        for (Bouquet[] bouquets : allBouquet) {                             // Вывод всех букетов + стоимость
            System.out.println("_______________________________");
            System.out.println("Цена этого букета " + price(bouquets));
            for (Bouquet bouquet : bouquets) {
                System.out.println(bouquet);
            }
            System.out.println("_______________________________");
            System.out.println();

        }
        for (Bouquet[] bouquets : allBouquet) {
            for (Bouquet bouquet : bouquets) {
                amount++;
            }
        }
        System.out.println(amount);                                     // Вывод общего количества проданных цветов


    }
}
