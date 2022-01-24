package LectureCode.Session5;

import java.util.ArrayList;

public class TerminalMenu {
    ArrayList<String> options = new ArrayList<>();
    public static void main(String[] args) {
        TerminalMenu menu = new TerminalMenu();

        menu.options.add("vis saldo");
        menu.options.add("Sett inn penger");
        menu.options.add("ta ut penger");
        int i = 1;
        for (var s : menu.options){
            printt(s,i++);
        }
    }

    private static void printt(String s,int i) {
        System.out.println("valg :"+i +" " + s );
    }
}
