package Tasks.mytasks;
import java.util.ArrayList;

public class WOW {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Item> usedItems = new ArrayList<>();
        Item apple = new Food();
        Item cake = new Food();
        Item sword = new Weapon();

        // legger til objeckt til listen vår kan væøre mat wåpen etc
        items.add(apple);
        items.add(cake);
        items.add(sword);

        // her looper vi gjennom alle itema, alle har en felles use() dette kan være ka som helst du kan ogås overwrite den vist du vill ha forskjelli reaksjon
        for (var item :items){
            item.use();

            if (item instanceof Food){
                ((Food)item).eat();
                //henter ut ting fra listen vår som er bruk å skal fjernes
                usedItems.add(item.removeFromInvetory(items));
            }


            if (item instanceof Weapon)
                ((Weapon) item).attack(); // caster til weapon, samme som Weapon wep = (Weapon) item og så wep.attack(); berre kortarte
        }

        // vi fjerner alle brukte items fra hovedlisten etter loopen
        items.removeAll(usedItems);
        // tømmer brukt listen da vi er ferdige med å fjerne items fra listen
        usedItems.clear();


        // her ser vi hva som er igjen av items etter at vi brukte det.
        System.out.println("");
        System.out.println("After Removing");
        for (var item :items){

            // nå ser vi at kun wåpenet er igjenn
            item.use();

            if (item instanceof Food){
                ((Food)item).eat();
                // gjpør klar for å fjerne tingen fra listen etter loopen( ikke lurt å fjerne ting fra listen meda du looper)
                usedItems.add(item.removeFromInvetory(items));
            }


            if (item instanceof Weapon)
                ((Weapon) item).attack(); // caster til weapon, samme som Weapon wep = (Weapon) item og så wep.attack(); berre kortarte
        }

        items.removeAll(usedItems);


    }


}
class Item{

    ArrayList<Item> drop = new ArrayList<>();

    // litt avansert metode på grunn av at vi ikke kan fjerne ting meda vi looper(gir feil)
    public Item removeFromInvetory(ArrayList<Item> items){
       int index = items.indexOf(this)  ;
       return items.get(index);

    }

    void use(){
        System.out.println("I am Item");
    }
    void cleanup(ArrayList<Item> items){
        items.removeAll(drop);
    }
}
class Food extends Item{

    void eat(){
        System.out.println("eating item!");
    }

}
class Weapon extends Item{


    //
    @Override
    public void use(){
        System.out.println("Equipting weapon!");
    }
    void equipt(){
        // put in hand
    }
    void attack(){
        System.out.println("Attack!!");
    }
}