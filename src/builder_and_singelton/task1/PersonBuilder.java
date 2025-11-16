package builder_and_singelton.task1;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Возраст не может быть отрицательным!");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        validate();
        return new Person(name, surname, age, address);
    }

    private void validate() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя и фамилия обязательно должны быть присвоены!!!");
        }
    }
}
