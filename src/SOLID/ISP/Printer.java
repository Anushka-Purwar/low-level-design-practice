package SOLID.ISP;

public class Printer implements ScanAndCopy{
    @Override
    public void scanAndCopy() {
        System.out.println("can scan and print");
    }
}
