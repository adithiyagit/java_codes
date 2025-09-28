abstract class Vehicle {
abstract void startEngine ();

void stopEngine () {
System.out.println ("Car Engine Stopped !");
System.out.println ("Bike Engine Stopped !");
}
}

class Car extends Vehicle {
void startEngine () {
System.out.println ("Car Engine started !");
}
}

class Bike extends Vehicle { 
void startEngine () {
System.out.println ("Bike Engine started !");
}
}

public class CarAbstract {
public  static void main (String[] args) {
Car car = new Car ();
Bike bike = new Bike ();

car.startEngine ();
car.stopEngine ();

bike.startEngine ();
bike.stopEngine ();

}
}

