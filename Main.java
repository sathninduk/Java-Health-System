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