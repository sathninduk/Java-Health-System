import Bank.BankingExample;
import Medicine.Medicine;
import Medicine.MedicineManager;
import Medicine.MedicineException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Health System Demo ===");
        
        // Demo Banking functionality (existing)
        System.out.println("\n--- Banking Module ---");
        BankingExample bank = new BankingExample();
        try {
            bank.lockAccount();
            System.out.println(bank.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Demo Medicine Management functionality (new)
        System.out.println("\n--- Medicine Management Module ---");
        MedicineManager medicineManager = new MedicineManager();
        
        try {
            // Add some medicines
            Medicine medicine1 = new Medicine("MED001", "Paracetamol", "Pain relief medication", "500mg", 100, LocalDate.of(2025, 12, 31));
            Medicine medicine2 = new Medicine("MED002", "Ibuprofen", "Anti-inflammatory medication", "400mg", 50, LocalDate.of(2024, 6, 30));
            Medicine medicine3 = new Medicine("MED003", "Aspirin", "Blood thinner medication", "75mg", 75, LocalDate.of(2023, 3, 15));
            
            medicineManager.addMedicine(medicine1);
            medicineManager.addMedicine(medicine2);
            medicineManager.addMedicine(medicine3);
            
            System.out.println("Added " + medicineManager.getMedicineCount() + " medicines to the system");
            
            // Search for a medicine
            Medicine foundMedicine = medicineManager.findMedicineById("MED001");
            if (foundMedicine != null) {
                System.out.println("Found medicine: " + foundMedicine.getName());
            }
            
            // Check for expired medicines
            System.out.println("Checking for expired medicines...");
            for (Medicine medicine : medicineManager.getExpiredMedicines()) {
                System.out.println("Expired: " + medicine.getName() + " (Expiry: " + medicine.getExpiryDate() + ")");
            }
            
            // Update medicine quantity
            medicineManager.updateMedicineQuantity("MED002", 25);
            System.out.println("Updated Ibuprofen quantity to 25");
            
            // Remove a medicine
            medicineManager.removeMedicine("MED003");
            System.out.println("Removed Aspirin from the system");
            System.out.println("Total medicines now: " + medicineManager.getMedicineCount());
            
        } catch (MedicineException e) {
            System.out.println("Medicine Error: " + e.getMessage());
        }
    }
}