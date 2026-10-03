package StructuralPatterns.DecoratorPattern.With;

public class Main {
    public static void main(String[] args) {
         Pizza pizza = new BasicPizza();
         pizza = new CheesePizza(pizza);
        pizza = new OlivePizza(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }
}
