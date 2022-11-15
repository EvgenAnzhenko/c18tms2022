import java.util.ArrayList;

public class MilitaryOffice {
    ArrayList<Person> personList;

    MilitaryOffice(ArrayList<Person> PersonRegistry) {
        this.personList = PersonRegistry;
    }

    public void list() {
        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("Мужской")) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }

    public void listMinsk() {
        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("Мужской") && person.getCity().equals("Минск")) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }

    public void listOld() {
        for (Person person : personList) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getGender().equals("Мужской")) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }

    public void listAlex() {
        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getFirstName().equals("Александр")) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
