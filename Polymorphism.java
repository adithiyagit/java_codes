// Polymorphism allows methods to behave differently based on the object
class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
void sound() { 
System.out.println("Moo");
}
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Upcasting: reference is Animal, object is Dog
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        a1.sound();
        a2.sound(); 
        a3.sound();
    }
}

