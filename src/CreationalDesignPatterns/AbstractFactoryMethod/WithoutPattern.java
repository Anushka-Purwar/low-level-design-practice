package CreationalDesignPatterns.AbstractFactoryMethod;

// concrete classes for windows and mac Ui

class WindowsButton{
    public void render(){
        System.out.println("render using window");
    }
}

class WindowsScroll{
    public void scroll(){
        System.out.println("scrolling using window");
    }
}

class MacOsButton{
    public void render(){
        System.out.println("render using MacOs");
    }
}

class MacOsScroll{
    public void scroll(){
        System.out.println("scrolling using MacOs");
    }
}
public class WithoutPattern {
    public static void main(String[] args) {
        //tight coupling of classes and concrete implementation in client code
        WindowsButton wb = new WindowsButton();
        wb.render();
        WindowsScroll wsc = new WindowsScroll();
        wsc.scroll();
    }
}
