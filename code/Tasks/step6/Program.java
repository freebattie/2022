package Tasks.step6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
Scanner scanner = null;
    private Scanner tryOpenFile(String path,String name){
        Scanner scanner=null;
        try {
            scanner = new Scanner(new File(path+ "\\"+ name+".txt"));
            }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return  scanner;
    }
    public void printFile(){
        try {
           while (scanner.hasNextLine()){
               String print ="";
               print = scanner.nextLine();
               System.out.println(print);
           }

        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }

    }
    public void openFIle(String path,String name){
        this.scanner = tryOpenFile(path,name);
    }

}
