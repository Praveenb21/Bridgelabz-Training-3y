package Constructor;

class LibraryBook2 {
    public String ISBN;
    protected String title;
    private String author;

    LibraryBook2 (String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class LibraryEBook extends LibraryBook2 {
    String format;

    LibraryEBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", Format: " + format);
    }

    public static void main(String[] args) {
        LibraryEBook eb = new LibraryEBook("123-456", "Java Basics", "Author A", "PDF");
        eb.displayDetails();
        eb.setAuthor("Author B");
        eb.displayDetails();
    }
}
