package QuestionFour;

public class QuestionFour {
	public static void main(String[] args) {
        // Creating the folder structure
        Folder root = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder("phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // Adding files to folders
        File htaccess = new File(".htaccess");
        File htRouter = new File("htrouter.php");
        File indexHtml = new File("index.html");

        // Building the tree
        root.addFolder(sourceFiles);
        sourceFiles.addFolder(phalcon);
        phalcon.addFolder(app);
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);
        publicFolder.addFile(htaccess);
        publicFolder.addFile(htRouter);
        publicFolder.addFile(indexHtml);

        // 1. Print out the php_demo1 folder and all subfolders and their content
        System.out.println("Initial structure:");
        root.print();

        // 2. Delete the folder app and print out the full structure
        phalcon.deleteFolder("app");
        System.out.println("\nAfter deleting 'app' folder:");
        root.print();

        // 3. Delete the folder public and print out the full structure
        sourceFiles.deleteFolder("public");
        System.out.println("\nAfter deleting 'public' folder:");
        root.print();
    }
}
