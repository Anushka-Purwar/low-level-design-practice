package StructuralPatterns.DecoratorPattern.Without;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheesePizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
