package org.shanoir.uploader.dicom.dto;


import org.shanoir.ng.importer.model.Study;

import java.util.ArrayList;
import java.util.List;

public class StudyDTO {
    private Study study;
    private List<SeriesDTO> series = new ArrayList<>();

    public Study getStudy() {
        return study;
    }

    public List<SeriesDTO> getSeries() {
        return series;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public void setSeries(List<SeriesDTO> series) {
        this.series = series;
    }
}
