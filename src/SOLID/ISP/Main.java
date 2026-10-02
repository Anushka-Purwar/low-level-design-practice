package SOLID.ISP;

public class Main {
    public static void main(String[] args) {
        Copier copier = new Copier();
        copier.copy();
        Printer printer = new Printer();
        printer.scanAndCopy();
    }
}
