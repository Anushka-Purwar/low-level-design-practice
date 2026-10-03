package StructuralPatterns.DecoratorPattern.With;

public class CheesePizza extends PizzaDecorator{

    public CheesePizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() { //same component as base class so that it can be used anywhere
        return decoratedPizza.getDescription() + " cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 20;
    }
}
