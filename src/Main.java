import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        // Create a list to store students

        // Create and add some initial students to the list
        Student student1 = new Student("Pooja", "Tajane", 12345, 75, 1);
        Student student2 = new Student("Mahesh", "Shinde", 12367, 80, 2);
        Student student3 = new Student("Mayur ", "Nasre", 12378, 60, 1);

        
        Course course = new Course("Java Programming", "Prof. Anamalai", 2023);


        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);
        

        // Enroll additional students

        Student[] additionalStudents = {
                new Student("Sakshi", "Urade", 99895, 65, 2),
                new Student("Parag", "Katekhaye", 88786, 90, 1)
        };
       
        course.enroll(additionalStudents);
        
        
        
     // Unenroll a student (remove from the collection)
        course.unEnroll(student2);
        System.out.println();
        System.out.println("Number of enrolled students : "+course.countStudents());
        System.out.println("Best grade of course : "+course.bestGrade());
        System.out.println("Average grade for the course : "+course.calculateAverageGrade());
        course.printStudentRanking();
        course.showAboveAverageStatus();
        

	}

}
