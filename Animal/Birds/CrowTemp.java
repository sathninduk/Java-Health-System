package Animal.Birds;

public class CrowTemp {
//
//    // Ghost fields to represent invariants based on private fields (optional)
//    // private /*@ ghost */ String ghostColor;
//    // private /*@ ghost */ int ghostAge;
//
//    private String color;
//    private int age;
//
//    /*@ requires color != null; */
//    /*@ ensures this.color == color && this.age == 0; */
//    public CrowTemp(String color) {
//        this.color = color;
//        this.age = 0;
//    }
//
//    /*@ ensures \result == color; */
//    public String getColor() {
//        return color;
//    }
//
//    /*@ ensures this.age == \old(this.age) + 1; */
//    public void incrementAge() {
//        age++;
//    }
//
//    /*@ ensures this.age == \old(this.age) - 1 && this.age >= 0; */
//    public void decrementAge() {
//        if (age > 0) {
//            age--;
//        }
//    }
//
//    /*@ ensures \result == age; */
//    public int getAge() {
//        return age;
//    }
//
//    /*@ requires age >= 0; */
//    /*@ ensures this.age == age; */
//    public void setAge(int age) {
//        if (age < 0) {
//            throw new IllegalArgumentException("Age cannot be negative");
//        }
//        this.age = age;
//    }
//
//    /*@ requires color != null; */
//    /*@ ensures this.color == color; */
//    public void setColor(String color) {
//        this.color = color;
//    }
}