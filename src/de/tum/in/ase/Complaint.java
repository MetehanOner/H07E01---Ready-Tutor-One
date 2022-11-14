package de.tum.in.ase;

import java.util.List;
import java.util.stream.Stream;

public class Complaint {
    private Exam exam;
    private String message;

    public Complaint(Exam exam, String message) {
        this.exam = exam;
        this.message = message;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //TODO make a complain on all exams which are still preliminary
    public static List<Complaint> complainAllPreliminary(Stream<Exam> exams) {
        return null;
    }
}
