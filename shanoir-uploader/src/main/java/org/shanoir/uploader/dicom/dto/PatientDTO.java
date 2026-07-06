package org.shanoir.uploader.dicom.dto;

import org.shanoir.ng.importer.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientDTO {
    private Patient patient;
    private List<StudyDTO> studies = new ArrayList<>();

    public Patient getPatient() {
        return patient;
    }

    public List<StudyDTO> getStudies() {
        return studies;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setStudies(List<StudyDTO> studies) {
        this.studies = studies;
    }
}
