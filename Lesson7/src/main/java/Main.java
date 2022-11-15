import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> personRegistry = new ArrayList<>();
        String firstName;
        String lastName;
        int age;
        String gender;
        String country;
        String city;
        String value;

        System.out.println("Вводим Имя нового призовника");
        while (!(value = reader.readLine()).isEmpty()) {
            firstName = value;
            System.out.println("Вводим Фамилию");
            lastName = reader.readLine();
            System.out.println("Вводим Пол");
            gender = reader.readLine();
            System.out.println("Вводим Возраст");
            age = Integer.parseInt(reader.readLine());
            System.out.println("Вводим Страну");
            country = reader.readLine();
            System.out.println("Вводим Город");
            city = reader.readLine();
            personRegistry.add(new Person(firstName, lastName, gender, age, country, city));
            System.out.println("Призывник добавлен !!!");
            System.out.println("Вводим Имя нового призывника или для Выхода нажима Enter");
        }
        MilitaryOffice mogilev = new MilitaryOffice(personRegistry);
        mogilev.listOld();
        mogilev.list();
        mogilev.listMinsk();
        mogilev.listAlex();
    }
}

