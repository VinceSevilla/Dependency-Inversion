public class Book implements Resource{
    private String bookTitle;

    public Book(String bookTitleParam) {
        this.bookTitle = bookTitleParam;
    }

    @Override
    public void borrow() {
        System.out.println(bookTitle + " borrowed by a student.");
    }
}