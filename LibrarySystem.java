abstract class LibraryResource {
private String title;
private String author;

public LibraryResource(String title,String author){
this.title=title;
this.author=author;
}

public String getTitle(){
return title;
}

public void setTitle(String title){
this.title=title;
}

public String getAuthor(){
return author;
}

public void setAuthor(String author){
this.author=author;
}

public abstract String getType();
}

class Book extends LibraryResource {
public Book(String title,String author){
super(title,author);
}

public String getType(){
return "Book";
}
}

class Magazine extends LibraryResource {
public Magazine(String title,String author){
super(title,author);
}

public String getType(){
return "Magazine";
}
}

class DVD extends LibraryResource {
public DVD(String title,String author){
super(title,author);
}

public String getType(){
return "DVD";
}
}

public class LibrarySystem {
public static void main(String[] args){
LibraryResource b=new Book("The Alchemist","Paulo Coelho");
LibraryResource m=new Magazine("National Geographic","Various");
LibraryResource d=new DVD("Inception","Christopher Nolan");

System.out.println(b.getTitle()+" by "+b.getAuthor()+" is a "+b.getType());
System.out.println(m.getTitle()+" by "+m.getAuthor()+" is a "+m.getType());
System.out.println(d.getTitle()+" by "+d.getAuthor()+" is a "+d.getType());
}
}
