# School System Project

This Java project is a simple implementation of a school system, including classes for students and courses. It demonstrates the fundamentals of Object-Oriented Programming.

## Student Class

### Attributes
- `String firstName`: First name of the student.
- `String lastName`: Last name of the student.
- `int registration`: Registration number of the student.
- `int grade`: Grade of the student.
- `int year`: Year of study for the student.

### Methods
1. `public void printFullName()`: Prints the full name of the student.
2. `public boolean isApproved()`: Returns true if the student's grade is greater than or equal to 60.
3. `public void changeYearIfApproved()`: Advances the student to the next year if the grade is >= 60. Prints "Congratulations" if the student has been approved.

### Constructors
- At least three different constructors for the Student class.

## Course Class

### Attributes
- `String courseName`: Name of the course.
- `String professorName`: Name of the professor.
- `int year`: Year of the course.
- `ArrayList<Student> students`: Collection that lists all students enrolled in the course.

### Methods
1. `public void enroll(Student student)`: Adds a student to the course.
2. `public void unEnroll(Student student)`: Removes a student from the course.
3. `public int countStudents()`: Returns the number of students in the course.
4. `public int bestGrade()`: Returns the best grade among all students in the course.
5. `public void enroll(Student[] students)`: Overloaded method to enroll an array of students.

### Additional Challenges
- Calculate the average grade for the course.
- Output a ranking with all students enrolled in the course and their respective grades.
- Show, for each student, whether they are above or below the course average.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ Idea.
3. Run the `main` method.
