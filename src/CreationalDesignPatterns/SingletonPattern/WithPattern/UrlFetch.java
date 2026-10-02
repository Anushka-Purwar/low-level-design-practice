package CreationalDesignPatterns.SingletonPattern.WithPattern;

public class UrlFetch {
    private String url;
    private String name;
    private  static UrlFetch instance;

    private UrlFetch(){
        url = "https";
        name = "security";
    }


    // this is static because you are not creating any object of this class before calling getInstance method hence
    //if not static then first need to instantiate this object in main then only we can call this method
    public static UrlFetch getInstance(){
        if(instance == null){
            instance = new UrlFetch();
        }

        return instance;
    }

    public String getUrl(){
        return url +" "+ name;
    }
}
