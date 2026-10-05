package StructuralPatterns.ProxyPattern.Without;

public class RealImage implements Image{
    private String name;

    public RealImage(String name){
        this.name = name;
        loadFile(); //expensive operation
    }

    private void loadFile() {
        System.out.println("loading file from disk");
    }

    @Override
    public void display() {
        System.out.println("Loading " + name);
    }
}
