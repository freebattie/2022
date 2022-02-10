package Tasks.task10;

import org.junit.jupiter.api.extension.ExtensionConfigurationException;

import java.nio.file.FileSystemNotFoundException;

public class Coffee {
    CoffeeType coffeeType;
    int quantity;

    public Coffee( int quantity) throws CoffeeException {

        if (quantity >= 0){
            throw new CoffeeException("Coffee quantity at 0 or lower");
        }
        else
            this.quantity = quantity;
    }
    public Coffee(CoffeeType coffeeType, int quantity)throws CoffeeException {
        this(quantity); //snarvei slik du ikke trenger sjekken i alle constructorene
        this.coffeeType = coffeeType;

    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public int getQuantity() {
        return quantity;
    }

    public Coffee(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
        this.quantity = 1;
    }
}
