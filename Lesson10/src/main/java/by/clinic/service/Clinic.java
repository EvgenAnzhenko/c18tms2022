package by.clinic.service;

import by.clinic.model.Dentist;
import by.clinic.model.Patient;
import by.clinic.model.Surgeon;
import by.clinic.model.Therapist;

public class Clinic {
    public void cure(Patient patient, Surgeon surgeon, Therapist therapist, Dentist dentist) {
        switch (patient.composeCurePlan()) {
            case 0 -> {
                System.out.println("Пациент отправлен к хирургу");
                surgeon.cure();
            }
            case 1 -> {
                System.out.println("Пациент отправлен к терапевту");
                therapist.cure();
            }
            case 2 -> {
                System.out.println("Пациент отправлен к дантисту");
                dentist.cure();
            }
        }
    }
}
