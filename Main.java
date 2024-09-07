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
    /*@ public normal_behavior
      @ ensures patientCount == 0;
      @*/
    public Hospital() {
        patientCount = 0;
    }

    // Getters
    /*@ public normal_behavior
      @ ensures \result == patientCount;
      @*/
    public int getPatientCount() {
        return patientCount;
    }

    // Setters
    /*@ public normal_behavior
      @ requires patientCount >= 0;
      @ ensures this.patientCount == patientCount;
      @*/
    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    // Increment patientCount by 1
    /*@ public normal_behavior
      @ ensures patientCount == \old(patientCount) + 1;
      @*/
    public void addPatient() {
        patientCount++;
    }

    // Decrement patientCount by 1
    /*@ public normal_behavior
      @ requires patientCount > 0;
      @ ensures patientCount == \old(patientCount) - 1;
      @*/
    public void removePatient() {
        patientCount--;
    }

    // Print patientCount
    public void print() {
        System.out.println("Patient count: " + patientCount);
    }
}