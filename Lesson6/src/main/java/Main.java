import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Иван", "Иванов");
        User user3 = new User("Петя", "Петров", 30);

        user1.setFirstName("Евгений");
        user1.setLastName("Анженко");
        user1.setAge(33);
        user1.setGender("male");
        user1.increaseAge(2);

        System.out.println(user3.fullName());
        System.out.println(user1.fullInfo());

        Computer com = new Computer("i7", 8192, 1000, 1000);
        com.on();
        com.info();

    }
}
