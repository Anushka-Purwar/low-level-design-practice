package StructuralPatterns.CompositePattern.Without;

public class File {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void showFile(){
        System.out.println("File: " + name);
    }
}
