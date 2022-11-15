public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String country;
    private String city;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    Person(String firstName, String lastName, String gender, int age, String country, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.city = city;

    }

}

