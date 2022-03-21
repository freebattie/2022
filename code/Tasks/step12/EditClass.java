package Tasks.step12;

import java.util.ArrayList;

public class EditClass {
    public void addNames(String name, ArrayList<String> names){
        names.add(name);
    }
    public void removeName(String name, ArrayList<String> names){

        if (names.contains(name))
            names.remove(name);
    }
    public void deleteList(ArrayList<String> names){
        names = null;
    }
}
