package org.shanoir.uploader.dicom;

import org.shanoir.uploader.dicom.dto.MediaDTO;
import org.shanoir.uploader.dicom.dto.PatientDTO;
import org.shanoir.uploader.dicom.dto.SeriesDTO;
import org.shanoir.uploader.dicom.dto.StudyDTO;
import org.shanoir.uploader.dicom.query.Media;
import org.shanoir.uploader.dicom.query.PatientTreeNode;
import org.shanoir.uploader.dicom.query.SerieTreeNode;
import org.shanoir.uploader.dicom.query.StudyTreeNode;

public final class MediaMapper {

    private MediaMapper() {}

    public static MediaDTO fromMedia(Media media) {
        MediaDTO mediaDto = new MediaDTO();

        for (DicomTreeNode patientNode : media.getTreeNodes()) {

            PatientTreeNode patientTreeNode = (PatientTreeNode) patientNode;

            PatientDTO patientDto = new PatientDTO();
            patientDto.setPatient(patientTreeNode.getPatient());

            for (DicomTreeNode studyNode : patientTreeNode.getTreeNodes()) {

                StudyTreeNode studyTreeNode = (StudyTreeNode) studyNode;

                StudyDTO studyDto = new StudyDTO();
                studyDto.setStudy(studyTreeNode.getStudy());

                for (DicomTreeNode serieNode : studyTreeNode.getTreeNodes()) {

                    SerieTreeNode serieTreeNode = (SerieTreeNode) serieNode;

                    SeriesDTO serieDto = new SeriesDTO();
                    serieDto.setSerie(serieTreeNode.getSerie());

                    studyDto.getSeries().add(serieDto);
                }

                patientDto.getStudies().add(studyDto);
            }

            mediaDto.getPatients().add(patientDto);
        }

        return mediaDto;
    }

}