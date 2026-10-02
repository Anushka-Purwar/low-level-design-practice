package SOLID.LSP;

public class ReadableFile implements Readable{
    @Override
    public void read() {
        System.out.println("read only file");
    }
}
