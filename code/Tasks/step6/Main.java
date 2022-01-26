package Tasks.step6;

public class Main {

    public static void main(String[] args) {
        Program prg = new Program();
        prg.openFIle("D:\\Skole\\java\\github\\2022\\code\\Tasks\\step6","opg4");
        prg.printFile();

        prg.tryWriteToFile("D:\\Skole\\java\\github\\2022\\code\\Tasks\\step6","opg5");
        prg.writeToFile("hello");
        prg.writeToFile("world");

    }
}
