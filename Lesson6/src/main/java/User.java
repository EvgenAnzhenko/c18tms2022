public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String fullName() {                  //Метод для возврата имени и фамилии
        return firstName + " " + lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String fullInfo() {
        return firstName + " " + lastName + " " + age + " y.o. " + gender;
    }

    @Deprecated
    public void increaseAge(int age) {  //Метод для увеличения возраста
        this.age = this.age + age;
    }

    User() {

    }

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    User(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

}



