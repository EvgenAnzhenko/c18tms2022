package by.clinic.service;

import by.clinic.model.Doctor;
import by.clinic.model.Patient;

import java.util.ArrayList;
import java.util.Arrays;

public class Clinic {

    ArrayList<Doctor> doctors = new ArrayList<>();

    public Clinic(Doctor... newDoctors) {
        doctors.addAll(Arrays.asList(newDoctors));

    }

    void cure(Patient patient) {
        getDoctor(patient).cure();
    }

    private Doctor getDoctor(Patient patient) {
        Doctor doctor = null;
        switch (patient.getCurePlan().getNumberOfCurePlan()) {
            case 0 -> doctor = findDoctor("Хирург");
            case 1 -> doctor = findDoctor("Терапевт");
            case 2 -> doctor = findDoctor("Дантист");
        }
        return doctor;
    }

    private Doctor findDoctor(String type) {
        Doctor doctor = null;
        for (Doctor doctorList : doctors) {
            if (doctorList.getSpecialization().equals(type)) {
                doctor = doctorList;
            }
        }
        return doctor;
    }

}

