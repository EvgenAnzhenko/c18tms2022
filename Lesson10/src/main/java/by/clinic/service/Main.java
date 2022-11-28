package by.clinic.service;

import by.clinic.model.Dentist;
import by.clinic.model.Patient;
import by.clinic.model.Surgeon;
import by.clinic.model.Therapist;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Антон", "Богданов");
        Surgeon surgeon = new Surgeon("Иван", "Иванов", "Хирург");
        Therapist therapist = new Therapist("Петя", "Петров", "Хирург");
        Dentist dentist = new Dentist("Костя", "Борисов", "Хирург");
        Clinic clinic = new Clinic();
        clinic.cure(patient, surgeon, therapist, dentist);
    }
}
