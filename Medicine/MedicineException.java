package Medicine;

public class MedicineException extends Exception {
    public MedicineException(String message) {
        super(message);
    }
    
    public MedicineException() {
        super("Medicine operation failed");
    }
}