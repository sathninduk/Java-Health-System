package Medicine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * MedicineManager handles medicine operations for the health system
 * including adding, removing, updating, and searching medicines
 */
public class MedicineManager {
    private List<Medicine> medicines;

    public MedicineManager() {
        this.medicines = new ArrayList<>();
    }

    /**
     * Add a new medicine to the system
     */
    public void addMedicine(Medicine medicine) throws MedicineException {
        if (medicine == null) {
            throw new MedicineException("Medicine cannot be null");
        }
        
        // Check if medicine with same ID already exists
        if (findMedicineById(medicine.getId()) != null) {
            throw new MedicineException("Medicine with ID " + medicine.getId() + " already exists");
        }
        
        medicines.add(medicine);
    }

    /**
     * Remove a medicine from the system by ID
     */
    public boolean removeMedicine(String medicineId) throws MedicineException {
        if (medicineId == null || medicineId.trim().isEmpty()) {
            throw new MedicineException("Medicine ID cannot be null or empty");
        }
        
        Medicine medicine = findMedicineById(medicineId);
        if (medicine == null) {
            throw new MedicineException("Medicine with ID " + medicineId + " not found");
        }
        
        return medicines.remove(medicine);
    }

    /**
     * Find a medicine by its ID
     */
    public Medicine findMedicineById(String medicineId) {
        if (medicineId == null) {
            return null;
        }
        
        for (Medicine medicine : medicines) {
            if (medicine.getId().equals(medicineId)) {
                return medicine;
            }
        }
        return null;
    }

    /**
     * Search medicines by name (case-insensitive partial match)
     */
    public List<Medicine> searchMedicinesByName(String name) {
        List<Medicine> results = new ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            return results;
        }
        
        String searchName = name.toLowerCase();
        for (Medicine medicine : medicines) {
            if (medicine.getName().toLowerCase().contains(searchName)) {
                results.add(medicine);
            }
        }
        return results;
    }

    /**
     * Get all medicines
     */
    public List<Medicine> getAllMedicines() {
        return new ArrayList<>(medicines);
    }

    /**
     * Get all expired medicines
     */
    public List<Medicine> getExpiredMedicines() {
        List<Medicine> expiredMedicines = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.isExpired()) {
                expiredMedicines.add(medicine);
            }
        }
        return expiredMedicines;
    }

    /**
     * Update medicine quantity
     */
    public void updateMedicineQuantity(String medicineId, int newQuantity) throws MedicineException {
        Medicine medicine = findMedicineById(medicineId);
        if (medicine == null) {
            throw new MedicineException("Medicine with ID " + medicineId + " not found");
        }
        
        if (newQuantity < 0) {
            throw new MedicineException("Quantity cannot be negative");
        }
        
        medicine.setQuantity(newQuantity);
    }

    /**
     * Get count of all medicines
     */
    public int getMedicineCount() {
        return medicines.size();
    }
}