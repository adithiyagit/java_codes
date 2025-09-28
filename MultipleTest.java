interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Print");
    }

    public void show() {
        System.out.println("Show");
    }
}

public class MultipleTest {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    }
}
