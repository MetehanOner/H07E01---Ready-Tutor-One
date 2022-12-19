package de.tum.in.ase;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Artemis {
    // TODO: calculate the average grade of all valid exams
    public static double averageGrade(Stream<Exam> exams) {

        return exams.parallel()
                .filter(e -> e.getGrade().getStatus().equals(Status.VALID))
                .mapToDouble(e -> e.getGrade().getValue())
                .average()
                .orElse(0);
    }

    // TODO: sort all exams by exam date in ascending order
    public static List<Exam> sortExamsByExamDate(Stream<Exam> exams) {

        return exams
                .sorted(Comparator.comparing(Exam::getExamDate)).toList();
    }

    // TODO: return the date of the first exam written
    public static LocalDate dateOfFirstExam(Stream<Exam> exams) {

        return exams
                .map(Exam::getExamDate)
                .min(Comparator.comparing(localDate -> localDate)).orElse(null);
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

    public static void main(String[] args) {

        Grade a = new Grade(1.0, Status.INVALID);
        Grade b = new Grade(0.0, Status.INVALID);
        Grade c = new Grade(0.0, Status.INVALID);
        Grade d = new Grade(0.0, Status.INVALID);
        Grade e = new Grade(0.0, Status.INVALID);

        Exam e0 = new Exam("mete", a, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e1 = new Exam("mete", b, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e2 = new Exam("mete", c, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e3 = new Exam("mete", d, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e4 = new Exam("mete", e, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());

        List<Exam> examsList = Arrays.asList(e0, e1, e2, e3, e4);
        System.out.println(averageGrade(examsList.stream()));



    }

}
