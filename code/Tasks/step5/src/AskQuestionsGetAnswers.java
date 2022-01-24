package Tasks.step5.src;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *  Task 5
 *          Ask N questions and get N answers
 *
 *  - [X ] Ask how many questions to gather as an int
 *  - [X ] Use a loop to ask for that many questions
 *  - [X ] Store each question received in the questions ArrayList
 *  - [X ] Ask each question and collect answers into the answers ArrayList
 *  - [ ] Loop through each question and output the answer given to that question
 *
 *
 *  In other words:
 *
 *      Ask how many questions the user should give you.
 *      Collect that many questions.
 *      Ask each question and collect the answer.
 *      Display a list of each question and answer given.
 *
 */

public class AskQuestionsGetAnswers {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();

    int questionCount = 0;

    void addQuestion(String question) {
       if (questionCount > 0){
           questions.add(question);
           questionCount--;
       }
    }
    public void getNumberOfQuestions(){
        Scanner intSC = new Scanner(System.in);
        this.questionCount = intSC.nextInt();
    }
    public void getQuestion(){

        String q = sc.nextLine();
        this.addQuestion(q);


    }
    public void showQuestionMenu(){
        printl("Please enter a question, you have  "+questionCount + " questions left to add" );

    }
    public void showIntroMenu(){
        printl("How many queston do you want to add?: ");

    }
    public void printl(String s){
        System.out.println(s);
    }
    public void showAnswerMenu(String s){
        printl("please enter your awnser for : \n"+s+"?");

    }
    void getAnswer() {

        String a = sc.nextLine();
        this.answers.add(a);


    }
    private void run() {
        int q =0;
        int menu =0;
        while (true){
            if (menu == 0){
                this.showIntroMenu();
                this.showInputMenu();
                this.getNumberOfQuestions();
                menu = 2;
            }
            if (menu == 2){
                this.showQuestionMenu();
                this.showInputMenu();
                this.getQuestion();

                if (questionCount == 0)
                    menu = 3;

            }
            if (menu == 3){

                this.showAnswerMenu(this.questions.get(q++));
                this.showInputMenu();
                this.getAnswer();
                if (answers.size() == questions.size())
                    menu = 4;
            }
            if (menu == 4){
                this.printQuestionAndAnswer();
                break;
            }

        }
    }

    private void printQuestionAndAnswer() {
        for (int i = 0; i < this.questions.size(); i++){
            printl("Question: " +questions.get(i));
            printl("Anwser: " + answers.get(i));

        }
    }

    private void showInputMenu() {
        System.out.print("Input :");

    }

    public static void main(String[] args) {
        AskQuestionsGetAnswers FAQ = new AskQuestionsGetAnswers();
        FAQ.run();

    }


}
