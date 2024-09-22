public class Hospital {
    // Attributes
    private int patientCount = 0;

    // Constructor
    public Hospital() {
        patientCount = 0;
    }

    // Getters
    public int getPatientCount() {
        return patientCount;
    }

    // Setters
    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    // Increment patientCount by 1
    public void addPatient() {
        patientCount++;
    }

    // Decrement patientCount by 1
    public void removePatient() {
        patientCount--;
    }

    // Print patientCount
    public void print() {
        System.out.println("Patient count: " + patientCount);
    }
}