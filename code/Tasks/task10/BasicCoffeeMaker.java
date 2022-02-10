package Tasks.task10;

import java.util.ArrayList;
import java.util.HashMap;

public class BasicCoffeeMaker extends AbstractCoffeeMaker{

    Grinder grinder;
    BrewingUnit brewingUnit;

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public BrewingUnit getBrewingUnit() {
        return brewingUnit;
    }

    public void setBrewingUnit(BrewingUnit brewingUnit) {
        this.brewingUnit = brewingUnit;
    }



    public BasicCoffeeMaker() {
        super();
        this.configMap.put(CoffeeType.Filter,new CoffeeConfiguration(100,100));
    }
    public BasicCoffeeMaker(CoffeeConfiguration coffeeConfiguration,Grinder grinder, BrewingUnit brewingUnit) throws CoffeeException {
        super();
        this.grinder = grinder;
        this.brewingUnit = brewingUnit;
        this.configMap.put(CoffeeType.Filter,coffeeConfiguration);
    }
    public Coffee brewFilterCoffee() throws CoffeeException{
       return  null;
    }
    public Coffee brewCoffee(CoffeeType coffeeType) throws CoffeeException {

        switch (coffeeType){
            case Filter:
                return brewFilterCoffee();
            default:
                throw new CoffeeException("Unexpected value: " + coffeeType);
        }
    }
    public ArrayList<Coffee> brewCoffee(CoffeeType coffeeType, int number) throws CoffeeException {
        ArrayList<Coffee> tmp = new ArrayList<>();
        for (int i = 0 ; i < number; i++){
            tmp.add(brewCoffee(coffeeType));
        }
        return tmp;

    }


}
