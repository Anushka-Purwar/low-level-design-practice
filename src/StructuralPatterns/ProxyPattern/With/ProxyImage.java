package StructuralPatterns.ProxyPattern.With;

public class ProxyImage implements Image{
    private String proxyname;
    private RealImage realImage;

    public ProxyImage(String name){
        this.proxyname = name;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(proxyname);
        }
        realImage.display();
    }
}
