package org.shanoir.uploader.dicom.dto;

import org.shanoir.ng.importer.model.Patient;
import org.shanoir.ng.importer.model.Serie;
import org.shanoir.uploader.model.Study;

import java.util.ArrayList;
import java.util.List;

public class MediaDTO{
    private List<PatientDTO> patients = new ArrayList<>();

    public List<PatientDTO> getPatients() {
        return patients;
    }

    public void setPatients(List<PatientDTO> patients) {
        this.patients = patients;
    }
}

