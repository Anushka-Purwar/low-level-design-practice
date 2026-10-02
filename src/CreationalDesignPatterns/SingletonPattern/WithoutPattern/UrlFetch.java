package CreationalDesignPatterns.SingletonPattern.WithoutPattern;

public class UrlFetch {
    private String url;
    private String name;

    public UrlFetch(){
        url = "https";
        name = "security";
    }

    public String getUrl(){
        return url +" "+ name;
    }
}
