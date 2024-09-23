package Animal.Birds;

/*@ spec_public */
public class CrowTemp {
    /*@ invariant color != null; */
    /*@ invariant age >= 0; */
    private String color;
    private int age;

    /*@ requires color != null; */
    /*@ ensures this.color == color && this.age == 0; */
    public CrowTemp(String color) {
        this.color = color;
        this.age = 0;
    }

    /*@ ensures \result == this.color; */
    public String getColor() {
        return color;
    }

    /*@ ensures this.age == \old(this.age) + 1; */
    public void incrementAge() {
        age++;
    }

    /*@ ensures this.age == \old(this.age) - 1; */
    public void decrementAge() {
        age--;
    }

    /*@ ensures \result == this.age; */
    public int getAge() {
        return age;
    }

    /*@ requires age >= 0; */
    /*@ ensures this.age == age; */
    public void setAge(int age) {
        this.age = age;
    }

    /*@ requires color != null; */
    /*@ ensures this.color == color; */
    public void setColor(String color) {
        this.color = color;
    }
}