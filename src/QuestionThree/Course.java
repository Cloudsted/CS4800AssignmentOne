package QuestionThree;

public class Course {
    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(String courseName, Instructor[] instructors, Textbook[] textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    // Print function
    public void print() {
        System.out.println("Course Name: " + courseName);
        for (Instructor instructor : instructors) {
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                    ", Office Number: " + instructor.getOfficeNumber());
        }
        for (Textbook textbook : textbooks) {
            System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor() +
                    ", Publisher: " + textbook.getPublisher());
        }
    }
}