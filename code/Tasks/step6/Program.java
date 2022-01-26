package Tasks.step6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    Scanner scanner = null;
    FileWriter fileWriter= null;
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
        }finally {
            scanner.close();
        }

    }
    public void openFIle(String path,String name){
        this.scanner = tryOpenFile(path,name);
    }
    public void writeToFile(String line){

        try {
            fileWriter.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void tryWriteToFile(String path, String name){
        FileWriter writer =null;
        try {
            writer  = new FileWriter(
                    path+ "\\"+ name+".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.fileWriter = writer;
    }

}
