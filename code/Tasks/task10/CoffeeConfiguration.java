package Tasks.task10;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemNotFoundException;

public class CoffeeConfiguration {

    int quantityCoffee;
    int quantityWater;

    public CoffeeConfiguration(int quantityCoffee, int quantityWater) {

        if (quantityCoffee <= 0 || quantityWater <= 0){
            throw new FileSystemNotFoundException();
        }
        else{
            this.quantityCoffee = quantityCoffee;
            this.quantityWater = quantityWater;
        }


    }

    public int getQuantityCoffee() {
        return quantityCoffee;
    }

    public void setQuantityCoffee(int quantityCoffee) {
        this.quantityCoffee = quantityCoffee;
    }

    public int getQuantityWater() {
        return quantityWater;
    }

    public void setQuantityWater(int quantityWater) {
        this.quantityWater = quantityWater;
    }
}
