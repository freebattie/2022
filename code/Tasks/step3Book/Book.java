package Tasks.step3Book;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;


    Book(String title,String author,int numberOfPages,Genre genre){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    //Setters

    public Genre getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printInfo(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Genre: "+this.genre);
        System.out.println("Pages: "+this.numberOfPages);
    }
}
