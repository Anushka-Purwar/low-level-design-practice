package CreationalDesignPatterns.AbstractFactoryMethod.WithPatternPack;

//interface for common methods

interface Button{
    void render();
}

interface Scroll{
    void scroll();
}
class WindowsButton implements Button{
    public void render(){
        System.out.println("render using window");
    }
}

class WindowsScroll implements Scroll{
    public void scroll(){
        System.out.println("scrolling using window");
    }
}

class MacOsButton implements Button{
    public void render(){
        System.out.println("render using MacOs");
    }
}

class MacOsScroll implements Scroll{
    public void scroll(){
        System.out.println("scrolling using MacOs");
    }
}

//Abstract Factory interface
interface UIFactory{
    Button createButton();
    Scroll createScroll();
}

class WindowsFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }
}

class MacosFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacOsScroll();
    }
}
public class WithPattern {
    private Button button;
    private Scroll scroll;

    public WithPattern(UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.scroll = uiFactory.createScroll();
    }
    public void renderUi(){
        button.render();
        scroll.scroll();
    }
    public static void main(String[] args) {
        UIFactory windows  = new WindowsFactory();
        WithPattern app = new WithPattern(new MacosFactory());
        app.renderUi();
    }
}
