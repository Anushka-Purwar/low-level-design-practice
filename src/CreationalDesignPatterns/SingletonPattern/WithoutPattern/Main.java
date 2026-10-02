package CreationalDesignPatterns.SingletonPattern.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        UrlFetch url1 = new UrlFetch();
        UrlFetch url2 = new UrlFetch();

        System.out.println(url1.getUrl());
        System.out.println(url2.getUrl());
        //value of both are same but both are not same object. Hence, same value object is instantiated twice causing memory load
        System.out.println(url1 == url2);
    }
}
