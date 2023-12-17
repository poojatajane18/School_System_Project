# School System Project

This Java project is a simple implementation of a school system, showcasing Object-Oriented Programming concepts.

## Student Class

### Attributes
- `String firstName`: First name of the student.
- `String lastName`: Last name of the student.
- `int registration`: Registration number of the student.
- `int grade`: Grade of the student.
- `int year`: Year of study for the student.

### Constructors
1. `public Student(String firstName, String lastName, int registration, int grade, int year)`: Full constructor.
2. `public Student(String firstName, String lastName, int registration)`: Constructor with minimal information.
3. `public Student(String firstName, String lastName)`: Constructor with default values.

### Methods
1. `public void printFullName()`: Prints the full name of the student.
2. `public void isApproved()`: Prints whether the student is approved based on the grade.
3. `public int changeYearIfApproved()`: Advances the student to the next year if approved.

## Course Class

### Attributes
- `String courseName`: Name of the course.
- `String professorName`: Name of the professor.
- `int year`: Year of the course.
- `List<Student> enrolledStudents`: Collection that lists all students enrolled in the course.

### Constructors
1. `public Course(String courseName, String professorName, int year)`: Full constructor.

### Methods
1. `public void enroll(Student student)`: Adds a student to the course.
2. `public void unEnroll(Student student)`: Removes a student from the course.
3. `public int countStudents()`: Returns the number of students in the course.
4. `public int bestGrade()`: Returns the best grade among all students in the course.
5. `public void enroll(Student[] students)`: Enrolls an array of students.
6. `public double calculateAverageGrade()`: Calculates the average grade for the course.
7. `public void printStudentRanking()`: Prints a ranking of students based on their grades.
8. `public void showAboveAverageStatus()`: Prints whether each student is above or below the course average.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ Idea.
3. Run the `main` method in the `Main` class.

## Sample Usage

1. Create and enroll students in a course.
2. Enroll additional students using an array.
3. Unenroll a student.
4. Display the number of enrolled students, best grade, average grade, student ranking, and above/below average status
