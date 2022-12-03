package by.clinic.service;

import by.clinic.model.*;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(new Dentist("Костя", "Борисов", "Дантист"),
                new Surgeon("Иван", "Иванов", "Хирург"),
                new Therapist("Петя", "Петров", "Терапевт"));
        Patient patient = new Patient("Антон", "Богданов");
        patient.setCurePlan(new CurePlan());
        clinic.cure(patient);
    }
}
