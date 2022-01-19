package Tasks.step3Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Oppgave 5");
        Book ringenesHerre = new Book("ringring","Bjarte",241,Genre.ACTION);
        ringenesHerre.printInfo();


        System.out.println("Oppgave 6");
        ringenesHerre.setAuthor("Petter");
        ringenesHerre.setTitle("DonkyKong");
        ringenesHerre.setNumberOfPages(10);
        System.out.println(ringenesHerre.getTitle());
        System.out.println(ringenesHerre.getAuthor());
        System.out.println(ringenesHerre.getNumberOfPages());
    }
}
