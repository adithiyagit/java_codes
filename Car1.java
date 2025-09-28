class Book {
    String Title;
    String Author;
    int price;

    public void setDetails(String Title, String Author, int year) {
        this.Title = title;
        this.Author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Car1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setDetails("Igikai", "unknown", 499);
        c1.display();
    }
}