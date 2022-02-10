package Tasks.task10;

import java.util.HashMap;

public abstract  class AbstractCoffeeMaker {
    HashMap<CoffeeType, CoffeeConfiguration > configMap;

    public AbstractCoffeeMaker() {
        this.configMap = new HashMap<>();
    }
    abstract Coffee brewCoffee(CoffeeType coffeeType) throws CoffeeException;
}
