package Tasks.step3Book;

public class BookRegister {
    Book[] books ;
    private int index;

    BookRegister(){
        books = new Book[20];
        index = 0;
    }

    //getters
    public int getIndex() {
        return index;
    }

    public void addBook(Book book){
        if (index < books.length){
            books[index] = book;
            index++;
        }
    }
    public int getNumberOfBooks(){
        return index+1;
    }
}
