package QuestionThree;

public class QuestionThree {
    public static void main(String[] args) {
        // Create Instructor objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Jane", "Doe", "1-2345");

        // Create Textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        // Create an array of Instructors
        Instructor[] instructors = {instructor1, instructor2};

        // Create an array of Textbooks
        Textbook[] textbooks = {textbook1, textbook2};

        // Create Course object
        Course course = new Course("Software Engineering", instructors, textbooks);

        // Print course details
        course.print();
    }
}