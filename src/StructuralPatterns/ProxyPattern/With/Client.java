package StructuralPatterns.ProxyPattern.With;

public class Client {
    public static void main(String[] args) {
        ProxyImage img1 = new ProxyImage("hi.png");

        //will load image only if called
        img1.display();
        img1.display();
    }
}
