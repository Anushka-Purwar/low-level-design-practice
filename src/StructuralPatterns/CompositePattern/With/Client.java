package StructuralPatterns.CompositePattern.With;

public class Client {
    public static void main(String[] args) {
        FileSystemComponent f1 = new File("file1");
        FileSystemComponent f2 = new File("file2");

        Folder folder = new Folder("Doc");

        //add subfolder
        Folder subFolder = new Folder("Sub");
        FileSystemComponent f3 = new File("file3");
        subFolder.addFiles(f3);

        folder.addFiles(f1);
        folder.addFiles(f2);
        folder.addFiles(subFolder);
        folder.showDetails();
    }
}
