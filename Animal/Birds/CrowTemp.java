package Animal.Birds;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

/**
 * Represents a crow with a specific color and age.
 *
 * @author [Your Name]
 */
@Immutable
public class CrowTemp {
    /** The color of the crow. */
    @Nonnull
    private final String color;

    /** The age of the crow. */
    private int age;

    /**
     * Creates a new crow with the specified color.
     *
     * @param color the color of the crow
     */
    public CrowTemp(@Nonnull String color) {
        this.color = color;
        this.age = 0;
    }

    /**
     * Gets the color of the crow.
     *
     * @return the color of the crow
     */
    @Nonnull
    public String getColor() {
        return color;
    }

    /**
     * Increments the age of the crow by 1.
     */
    public void incrementAge() {
        age++;
    }

    /**
     * Decrements the age of the crow by 1, but prevents the age from becoming negative.
     */
    public void decrementAge() {
        if (age > 0) {
            age--;
        }
    }

    /**
     * Gets the age of the crow.
     *
     * @return the age of the crow
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the crow, preventing the age from becoming negative.
     *
     * @param age the new age of the crow
     * @throws IllegalArgumentException if the specified age is negative
     */
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    /**
     * Sets the color of the crow.
     *
     * @param color the new color of the crow
     */
    public void setColor(@Nonnull String color) {
        this.color = color;
    }
}