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

        for (int i = 0; i < mogilev.getRecruits().size(); i++) {
            System.out.println(mogilev.getRecruits().get(i).getFirstName() + " " + mogilev.getRecruits().get(i).getLastName());
        }
        System.out.println("Количество призывников с именем Александр : " + (mogilev.getRecruitsByName("Александр")).size());
        System.out.println("Количество призывников c заданным возрастом : " + (mogilev.getRecruitsByAge(25, 27)).size());
        System.out.println("Количество призывников проживающих в Минске : " + (mogilev.getRecruitsByCity("Минск")).size());
        ;


    }
}

