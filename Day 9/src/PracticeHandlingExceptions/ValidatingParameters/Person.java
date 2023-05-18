package PracticeHandlingExceptions.ValidatingParameters;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        validateName(name);
        validateAge(age);

        this.name = name;
        this.age = age;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name provided");
        }
    }

    private void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age provided");
        }
    }

    public String getName() {
        return name;
    }

}


