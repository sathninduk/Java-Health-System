package Medicine;

import java.time.LocalDate;

/**
 * Medicine class represents a medicine entity in the health system
 * with basic properties and validation
 */
public class Medicine {
    private String id;
    private String name;
    private String description;
    private String dosage;
    private int quantity;
    private LocalDate expiryDate;

    public Medicine(String id, String name, String description, String dosage, int quantity, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dosage = dosage;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDosage() {
        return dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Utility methods
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dosage='" + dosage + '\'' +
                ", quantity=" + quantity +
                ", expiryDate=" + expiryDate +
                ", expired=" + isExpired() +
                '}';
    }
}