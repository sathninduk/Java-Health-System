public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Add 3 patients
        hospital.addPatient();
        hospital.addPatient();
        hospital.addPatient();

        // Remove 1 patient
        hospital.removePatient();

        // Print patient count
        hospital.print();
    }
}

class Hospital {
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