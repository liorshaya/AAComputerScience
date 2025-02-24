package StudyForFun.YearA.Madmah2.Book;

public class Library {
    private Student[] students;
    private Book[] books;

    public Book[] getBooks(String name, String author){
        int count = 0;
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i].getName().equals(name) && this.books[i].getAuthor().equals(author)){
                count++;
            }
        }
        Book[] newArray = new Book[count];
        int index = 0;
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i].getName().equals(name) && this.books[i].getAuthor().equals(author)){
                newArray[index] = this.books[i];
                index++;
            }
        }
        return newArray;
    }

    public boolean loan(Student student, String name, String author){
        Book[] copyBooks = this.getBooks(name,author);
        int copyBooksNum = this.getBooks(name,author).length;
        boolean canLoan = false;
        if(student.getNumYear() ==1){
            if(copyBooksNum >= 5 && student.howMuchLoan() < 2){
                canLoan = true;
            }
        } else if (student.getNumYear() ==2) {
            if(copyBooksNum >= 2 && student.howMuchLoan() < 2){
                canLoan = true;
            }
        }
        else{
            if(copyBooksNum >= 1 && student.howMuchLoan() < 2){
                canLoan = true;
            }
        }

        if(canLoan){
            student.addBook(copyBooks[0]);
            removeBook(name, author);
        }
        return canLoan;
    }

    public void removeBook(String name ,String author){
        Book[] newArray = new Book[this.books.length-1];
        boolean isRemove = false;
        int index = 0;
        for (int i = 0; i < this.books.length; i++) {
            if(!this.books[i].getName().equals(name) && this.books[i].getAuthor().equals(author) || isRemove){
                newArray[index] = books[i];
                index++;
            }
            else {
                isRemove = true;
            }
        }
        this.books = newArray;
    }
}
