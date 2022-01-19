package Tasks.step4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public void runProgram(){
        System.out.println("Program starting");
    }
    public void oppgave6(){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int input =0;
        while (true){
            System.out.println("please enter a hole number, - value to return the sum");
            input = sc.nextInt();
            if (input < 0)
                break;
            else
                sum+=input;
        }
        System.out.println("Total value is: " + sum);
    }
    public void oppgave7(){
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int menu =0;
        while (true){
            if (menu == 0){
                printMenu();
                menu = sc.nextInt();
            }
            else if(menu == 2){
                println("");
                println("Words in array: ");
                println("************** ");
                for (String x : words){
                    println(x);
                }
                menu = 0;
                println("************** ");
            }
            else if(menu == 1){
                Scanner sc2 = new Scanner(System.in);
                println("");
                println("Enter a word to add: ");
                String word = sc2.nextLine();
                words.add(word);
                menu = 0;
            }
            else
                break;


        }

    }

    private void printMenu() {
        println("");
        println("Oppgave 7 :");
        println("1 to add single word :");
        println("2 to display all words :");
        println("3 to end:");
        print("Input: ");
    }

    public void println(String x){
        System.out.println(x);
    }
    public void print(String x){
        System.out.print(x);
    }
}
