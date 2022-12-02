package by.clinic.service;

import by.clinic.model.Dentist;
import by.clinic.model.Patient;
import by.clinic.model.Surgeon;
import by.clinic.model.Therapist;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(new Dentist("Костя", "Борисов", "Дантист"),
                new Surgeon("Иван", "Иванов", "Хирург"),
                new Therapist("Петя", "Петров", "Терапевт"));
        Patient patient = new Patient("Антон", "Богданов");
        clinic.cure(patient);
    }
}
