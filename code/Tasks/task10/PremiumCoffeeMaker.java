package Tasks.task10;

public class PremiumCoffeeMaker extends BasicCoffeeMaker{

    PremiumCoffeeMaker(){
        this.configMap.put(CoffeeType.Filter, new CoffeeConfiguration(30, 180));
        this.configMap.put(CoffeeType.Espresso, new CoffeeConfiguration(30, 30));
        this.configMap.put(CoffeeType.Americano, new CoffeeConfiguration(30, 100));
    }
    public Coffee brewEspresso(){
        return  null;
    }
    public Coffee brewAmericano(){
        return null;
    }
    @Override
    public Coffee brewCoffee(CoffeeType coffeeType) throws CoffeeException {

        switch (coffeeType){
            case Filter -> {return super.brewFilterCoffee();}
            case Espresso -> {return brewEspresso();}
            case Americano -> {return brewAmericano();}
            default -> throw new CoffeeException("Not a valid CoffeeTYpe " + coffeeType);
        }
    }
}
