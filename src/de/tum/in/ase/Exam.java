package de.tum.in.ase;

import java.time.LocalDate;

public class Exam {
    private String name;
    private Grade grade;
    private boolean isOnline;
    private int ECTS;
    private LocalDate examDate;
    private LocalDate publicationDate;

    public Exam(String name, Grade grade, boolean isOnline, int ECTS, LocalDate examDate, LocalDate publicationDate) {
        this.name = name;
        this.grade = grade;
        this.isOnline = isOnline;
        this.ECTS = ECTS;
        this.examDate = examDate;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
               "name='" + name + '\'' +
               ", grade=" + grade +
               ", isOnline=" + isOnline +
               ", ECTS=" + ECTS +
               ", examDate=" + examDate +
               ", publicationDate=" + publicationDate +
               '}';
    }
}
