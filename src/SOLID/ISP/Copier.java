package SOLID.ISP;

public class Copier implements CopyMach{
    @Override
    public void copy() {
        System.out.println("can only copy");
    }
}
