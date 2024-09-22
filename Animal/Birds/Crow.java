/**
 * User Acceptance Criteria for Crow Class
 *
 * 1. Initialization
 *    - Given a new `Crow` object is created with a specific color,
 *    - When the `Crow` object is initialized,
 *    - Then the `color` attribute should be set to the provided color,
 *    - And the `age` attribute should be initialized to 0.
 *
 * 2. Get Color
 *    - Given a `Crow` object with a specific color,
 *    - When the `getColor` method is called,
 *    - Then it should return the current color of the crow.
 *
 * 3. Set Color
 *    - Given a `Crow` object,
 *    - When the `setColor` method is called with a new color,
 *    - Then the `color` attribute should be updated to the new color.
 *
 * 4. Increment Age
 *    - Given a `Crow` object with a specific age,
 *    - When the `incrementAge` method is called,
 *    - Then the `age` attribute should be incremented by 1.
 *
 * 5. Decrement Age
 *    - Given a `Crow` object with a specific age,
 *    - When the `decrementAge` method is called,
 *    - Then the `age` attribute should be decremented by 1,
 *    - And the `age` attribute should not be less than 0.
 *
 * 6. Get Age
 *    - Given a `Crow` object with a specific age,
 *    - When the `getAge` method is called,
 *    - Then it should return the current age of the crow.
 *
 * 7. Set Age
 *    - Given a `Crow` object,
 *    - When the `setAge` method is called with a new age,
 *    - Then the `age` attribute should be updated to the new age,
 *    - And the `age` attribute should not be less than 0.
 */

package Animal.Birds;

public class Crow {
    private String color;
    private int age;

    public Crow(String color) {
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
        // change
    }
}
