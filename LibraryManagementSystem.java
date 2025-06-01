import java.util.Date;

// Catalog class
class Catalog {
    private String authorName;
    private int noOfCopies;

    public void updateInfo() {
        // Code to update catalog info
    }

    public void search() {
        // Code to search in catalog
    }
}

// Librarian class
class Librarian {
    public String name;
    public String address;
    public int mobileNo;

    public void updateInfo() {
        // Code to update librarian information
    }

    public void manageMemberInfo() {
        // View or edit member information
    }

    public void issueBooks() {
        // Code to issue books
    }

    public void searchBook() {
        // Code to search books
    }

    public void returnBook() {
        // Code to process book return
    }
}

// Books class
class Books {
    public String authorName;
    public int noOfBooks;

    public void addToCatalog() {
        // Code to add book to catalog
    }

    public void removeFromCatalog() {
        // Code to remove book from catalog
    }
}

// Alert class
class Alert {
    public Date issueDate;
    public String bookName;
    public Date returnDate;
    public int fine;

    public void viewAlert() {
        // Code to view alert details
    }

    public void calculateFine() {
        // Code to calculate fine
    }

    public void deleteAlertByNumber() {
        // Code to delete alert by number
    }
}

// Member (superclass for students & faculty)
class Member {
    public String name;
    public String address;
    public int memberNo;

    public void requestBook() {
        // Code for book request
    }

    public void returnBook() {
        // Code for book return
    }
}

// FacultyMember class (inherits Member)
class FacultyMember extends Member {
    public String facultyId;

    public void checkoutBook() {
        // Code for checking out book
    }
}

// Students class (inherits Member)
class Students extends Member {
    public String studentId;
    public String studentCall;

    public void checkoutBook() {
        // Code for checking out book
    }

    public void returnBook() {
        // Code for returning book
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Sample objects and actions

        Librarian librarian = new Librarian();
        librarian.name = "Mr. Anik";
        librarian.address = "Dhanmondi";
        librarian.mobileNo = 1234567890;

        Students student = new Students();
        student.name = "Nafisa Tasfia";
        student.studentId = "2025CS123";
        student.studentCall = "CSE_21";

        Books book = new Books();
        book.authorName = "J.K. Rowling";
        book.noOfBooks = 3;

        // Simulating some actions
        librarian.issueBooks();
        student.checkoutBook();
        student.returnBook();
        librarian.returnBook();
    }
}