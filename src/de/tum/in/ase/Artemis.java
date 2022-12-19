package de.tum.in.ase;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Artemis {
    // TODO: calculate the average grade of all valid exams
    public static double averageGrade(Stream<Exam> exams) {
        double sumOfNumbers = exams.parallel()
                .filter(e -> e.getGrade().getStatus().equals(Status.VALID))
                .mapToDouble(e -> e.getGrade().getValue())
                .count();

        double sumOfGrades = exams.parallel()
                .filter(e -> e.getGrade().getStatus().equals(Status.VALID))
                .mapToDouble(e -> e.getGrade().getValue())
                .sum();

        return sumOfGrades/sumOfNumbers;
    }

    // TODO: sort all exams by exam date in ascending order
    public static List<Exam> sortExamsByExamDate(Stream<Exam> exams) {
        return null;
    }

    // TODO: return the date of the first exam written
    public static LocalDate dateOfFirstExam(Stream<Exam> exams) {
        return null;
    }

    // TODO: count how many exams are online and onsite
    public static Map<Boolean, Integer> countByOnline(Stream<Exam> exams) {
        return null;
    }


	// TODO: create a report using the passed formatter
	//public static String createFormattedReport(Stream<Exam> exams, Formatter formatter) {
	//	return null;
	//}

    // TODO: create a simple report string
    public static String createSimpleReport(Stream<Exam> exams) {
        return null;
    }

}
