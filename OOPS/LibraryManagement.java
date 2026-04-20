package OOPS;
abstract class LibraryItem {
    int itemId;
    String title;
    boolean isAvailable;
    LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isAvailable = true;
    }
    abstract void getLoanDonation();
    void borrowItem() {

    }
    void returnItem() {

    }
    void displayDetails() {

    }
}
class Book extends LibraryItem {
    String author;
    int loanDuration = 14;
}
class Magazine extends LibraryItem {
    int issueNumber;
    int loanDuration = 7;
}
class DVD extends LibraryItem {
    int duration; // in minutes
    int loanDuration = 3;
}
class User {
    int userId;
    String name;
    
    void borrowItem(LibraryItem item) {
        if (item.isAvailable) {
            item.borrowItem();
            System.out.println(name + " borrowed " + item.title);
        } else {
            System.out.println(item.title + " is not available for borrowing.");
        }
    }
    void returnItem(LibraryItem item) {
        item.returnItem();
        System.out.println(name + " returned " + item.title);
    }
    void showBorrowedItems() {
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        
    }
}
