package QuestionFour;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Print function
    public void print() {
        System.out.println(name);
    }
}

