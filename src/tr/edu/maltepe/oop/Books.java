package tr.edu.maltepe.oop;

public class Books {

    private String bookname;
    private long isbn;

    public Books(String name, long isbnno){
        bookname = name;
        isbn = isbnno;
    }

    public void isbn(long isbn){
        System.out.println("ISBN KODU :" + isbn);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
