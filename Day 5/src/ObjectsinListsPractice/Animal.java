package ObjectsinListsPractice;

public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    public String toString() {
        return name + " is a dog: " + isDog;
    }
}
