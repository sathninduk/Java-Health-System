package Animal.Birds;

public class Crow {
    private String color;
    private int age;

    /*@ public invariant age >= 0; @*/

    /*@ requires color != null;
      @ ensures this.color.equals(color);
      @*/
    public Crow(String color) {
        this.color = color;
    }

    /*@ ensures \result.equals(color); @*/
    public /*@ pure @*/ String getColor() {
        return color;
    }

    /*@ ensures age == \old(age) + 1; @*/
    public void incrementAge() {
        age++;
    }

    /*@ ensures age == \old(age) - 1; @*/
    public void decrementAge() {
        age--;
    }

    /*@ ensures \result == age; @*/
    public /*@ pure @*/ int getAge() {
        return age;
    }

    /*@ requires age >= 0;
      @ ensures this.age == age;
      @*/
    public void setAge(int age) {
        this.age = age;
    }

    /*@ requires color != null;
      @ ensures this.color.equals(color);
      @*/
    public void setColor(String color) {
        this.color = color;
    }
}
