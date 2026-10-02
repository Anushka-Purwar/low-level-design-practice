package SOLID.LSP;

public class WritableFile extends ReadableFile implements Writable{

    @Override
    public void write() {
        System.out.println("writable File");
    }
}
