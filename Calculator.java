class Calculator {

int add(int a , int b) {
return a+b;
}

double add(double a, double b) {
return a+b;
}

int add(int a, int b, int c) {
return a+b+c;
}

public static void main(String[] args) {
Calculator c = new Calculator ();

int sum1 = c.add(25,25);
System.out.println("Sum of Two Integers: " + sum1);

double sum2 = c.add(5.5,2.5);
System.out.println("Sum of Two Doubles: " + sum2);

int sum3 = c.add(10,20,30);
System.out.println("Sum of Three Integers: " + sum3);
}
}
