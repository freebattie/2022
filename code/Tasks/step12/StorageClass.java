package Tasks.step12;

import java.util.ArrayList;

public class StorageClass {
    ArrayList<String> names;

    public StorageClass(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> getNames() {
        return names;
    }
    public String getNameAtIndex(int index){
        return names.get(index);
    }
    public void addNames(String name){
        names.add(name);
    }
    public void reomveName(String name){

        if (names.contains(name))
            names.remove(name);
    }
}
