package QuestionFour;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addFolder(Folder folder) {
        this.subFolders.add(folder);
    }

    public void deleteFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }

    // Print function
    public void print() {
        System.out.println(name);
        for (File file : files) {
            System.out.print("-- ");
            file.print();
        }
        for (Folder subFolder : subFolders) {
            System.out.print("-- ");
            subFolder.print();
        }
    }
}
