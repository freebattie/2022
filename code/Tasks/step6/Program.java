package Tasks.step6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = null;
    FileWriter fileWriter= null;
    private String path;
    private String name;

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
        //tryWriteToFile(this.path,this.name);
        try {
            fileWriter.append(line+"\n");
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void closeWriter(){
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void tryWriteToFile(String path, String name){
        this.path = path;
        this.name = name;
        FileWriter writer =null;
        try {
            writer  = new FileWriter(
                    path+ "\\"+ name+".txt",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.fileWriter = writer;
    }

    public void oppgave5() {

        int count = 0;
        scanner = new Scanner(System.in);


        ArrayList<String> words = getInputFromUser();
        Path currentRelativePath = Paths.get("");
        String dir= currentRelativePath.toAbsolutePath().toString();
        tryWriteToFile(dir,"opg6");
        for (String word : words){
            writeToFile(word);
        }
        closeWriter();
    }

    private ArrayList<String> getInputFromUser() {
        int count = 5;
        ArrayList<String> words = new ArrayList<>();
        while (count > 0){
            println("write inn "+count+ " words to add to file: ");
            print("Input: ");
            words.add(scanner.nextLine());
            count--;



        }
        return words;
    }

    private void println(String s) {
        System.out.println(s);
    }
    private void print(String s) {
        System.out.print(s);
    }
}
