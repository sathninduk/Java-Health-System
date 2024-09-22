package Animal;

public class Cat {
    private String color;
    private int age;

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void incrementAge() {
        age++;
    }

    public void decrementAge() {
        age--;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}