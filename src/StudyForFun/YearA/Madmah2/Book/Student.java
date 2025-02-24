package StudyForFun.YearA.Madmah2.Book;

public class Student {
    private String name;
    private Book[] books;
    private int numYear;

    public int getNumYear(){
        return this.numYear;
    }

    public Book[] getBooks(){
        return this.books;
    }

    public String getName(){
        return this.name;
    }

    public int howMuchLoan(){
        return books.length;
    }

    public void addBook(Book book){
        if(books.length < 2){
            Book[] newArray = new Book[books.length+1];

            for (int i = 0; i < books.length; i++) {
                newArray[i] = books[i];
            }
            newArray[books.length] = book;
            this.books = newArray;
        }
    }

}
