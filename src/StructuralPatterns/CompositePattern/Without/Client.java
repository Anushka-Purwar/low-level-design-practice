package StructuralPatterns.CompositePattern.Without;

public class Client {
    public static void main(String[] args) {
        File f1 = new File("file1");
        File f2 = new File("file2");

        Folder folder = new Folder("Doc");
        folder.addFiles(f1);
        folder.addFiles(f2);
        folder.showDetails();
    }
}
