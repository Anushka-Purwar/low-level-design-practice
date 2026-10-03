package StructuralPatterns.DecoratorPattern.Without;

public class CheeseOlive extends BasicPizza{
    //doesnot follow SRP
    @Override
    public String getDescription() {
        return super.getDescription() + "cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }
}
