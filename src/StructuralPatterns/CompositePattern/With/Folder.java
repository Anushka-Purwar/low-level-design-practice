package StructuralPatterns.CompositePattern.With;

import java.util.ArrayList;
import java.util.List;

public class Folder  implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components ;

    public Folder(String name){
        this.name = name;
        components = new ArrayList<>();
    }

    public void addFiles(FileSystemComponent component){
        components.add(component);
    }

    public void showDetails(){
        System.out.println("Folder: " + name);
        for(FileSystemComponent f : components){
            f.showDetails();
        }
    }
}
