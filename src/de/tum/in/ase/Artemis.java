package de.tum.in.ase;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Artemis {
    // TODO: calculate the average grade of all valid exams
    public static double averageGrade(Stream<Exam> exams) {


        double average = exams.parallel()
                .filter(e -> e.getGrade().getStatus().equals(Status.VALID))
                .mapToDouble(e -> e.getGrade().getValue())
                .average()
                .orElse(Double.NaN);

        return average;
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

    public static void main(String[] args) {

        Grade a = new Grade(1.0, Status.VALID);
        Grade b = new Grade(2.0, Status.VALID);
        Grade c = new Grade(3.0, Status.VALID);
        Grade d = new Grade(3.3, Status.VALID);
        Grade e = new Grade(4.7, Status.VALID);

        Exam e0 = new Exam("mete", a, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e1 = new Exam("mete", b, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e2 = new Exam("mete", c, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e3 = new Exam("mete", d, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());
        Exam e4 = new Exam("mete", e, true, 30, LocalDate.of(2022, 07, 18), LocalDate.now());

        List<Exam> examsList = Arrays.asList(e0, e1, e2, e3, e4);
        System.out.println(averageGrade(examsList.stream()));


    }

}
