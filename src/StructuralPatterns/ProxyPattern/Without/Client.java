package StructuralPatterns.ProxyPattern.Without;

public class Client {
    public static void main(String[] args) {
        RealImage img1 = new RealImage("hi.png");//will display even if not needed

        img1.display();//displaying again
        img1.display();//will again load from disk
    }
}
