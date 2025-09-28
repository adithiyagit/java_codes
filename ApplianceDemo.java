abstract class Appliance {
private int powerRating;

public Appliance (int powerRating) {
this.powerRating = powerRating;
}

public int getPowerRating() {
return powerRating;
}

public void setPowerRating(int powerRating) {
this. powerRating = powerRating;
}

public abstract void turnOn();
public abstract void turnOff();
}

class Fan extends Appliance {
public Fan (int powerRating){
 super (powerRating);
}
public void turnOn() {
System.out.println("Fan is ON. Power Rating: " + getPowerRating() + "W");
}
public void turnOff() {
System.out.println("Fan is OFF.");
}
}
class Light extends Appliance {
public Light  (int powerRating){
 super (powerRating);
}
public void turnOn() {
System.out.println("Light is ON. Power Rating: " + getPowerRating() + "W");
}
public void turnOff() {
System.out.println("Light is OFF.");
}
}
class AC extends Appliance {
public AC  (int powerRating){
 super ( powerRating);
}
public void turnOn() {
System.out.println("AC is ON. Power Rating: " + getPowerRating() + "W");
}
public void turnOff() {
System.out.println("AC is OFF.");
}
}
 
public class ApplianceDemo {
public static void main(String[] args) {
Fan fan = new Fan (70);
Light light = new Light(40);
AC ac = new AC(1500);

fan.turnOn();
fan.turnOff();

light.turnOn();
light.turnOff();

ac.turnOn();
ac.turnOff();
 
ac.setPowerRating(1800);
System.out.println("Updated AC Power Rating: " + ac.getPowerRating() + "W");
    }
}