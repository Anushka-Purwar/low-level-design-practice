package StructuralPatterns.DecoratorPattern.With;

public class OlivePizza extends PizzaDecorator{
    public OlivePizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() { //same component as base class so that it can be used anywhere
        return decoratedPizza.getDescription() + " olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 40;
    }
}
