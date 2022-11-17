import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    ArrayList<Person> personList;

    public MilitaryOffice(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getRecruits() {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("Мужской")) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getRecruitsByName(String name) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getFirstName().equals(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getRecruitsByCity(String name) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getCity().equals(name)) {
                result.add(person);
            }
        }
        return result;
    }


    public List<Person> getRecruitsByAge(int from, int till) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() >= from && person.getAge() <= till) {
                result.add(person);
            }
        }
        return result;
    }

}
