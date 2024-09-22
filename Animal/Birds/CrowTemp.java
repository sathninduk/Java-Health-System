package Animal.Birds;

public class CrowTemp {
    private String color;
    private int age;
    
    /*@
      @ ensures getColor() == color;
      @ ensures getAge() == 0;
      @*/
    public CrowTemp(String color) {
        this.color = color;
        this.age = 0;
    }

    /*@
      @ ensures \result == color;
      @*/
    public String getColor() {
        return color;
    }

    /*@
      @ ensures age == \old(age) + 1;
      @*/
    public void incrementAge() {
        age++;
    }

    /*@
      @ ensures age == \old(age) - 1;
      @ ensures age >= 0;
      @*/
    public void decrementAge() {
        if (age > 0) {
            age--;
        }
    }

    /*@
      @ ensures \result == age;
      @*/
    public int getAge() {
        return age;
    }

    /*@
      @ requires age >= 0;
      @ ensures age == \old(age);
      @*/
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    /*@
      @ ensures color == \old(color);
      @*/
    public void setColor(String color) {
        this.color = color;
    }
}