/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Lirik Salihu
 * @version 09/16/2024
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed = 0;
    private boolean courseText;

    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public boolean isCourseText() {
        return courseText;
    }

    public void setRefNumber(String ref) {
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error: Reference number must be at least 3 characters long.");
        }
    }
    
    public void borrow() {
        borrowed++;
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public void printDetails() {
        String ref = refNumber.isEmpty() ? "ZZZ" : refNumber;
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + 
                           ", RefNumber: " + ref + ", Borrowed: " + borrowed +
                           ", Course Text: " + (courseText ? "Yes" : "No"));
    }
}