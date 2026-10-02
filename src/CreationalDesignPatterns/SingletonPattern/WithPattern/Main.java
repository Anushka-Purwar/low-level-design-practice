package CreationalDesignPatterns.SingletonPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        UrlFetch url1 = UrlFetch.getInstance();
        UrlFetch url2 = UrlFetch.getInstance();

        System.out.println(url2.getUrl());
        System.out.println(url1.getUrl());

        //only once instance is created at a time
        System.out.println(url1 == url2);
    }
}
