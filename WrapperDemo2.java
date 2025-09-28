// File: WrapperDemo2.java
public class WrapperDemo2 {
    public static void main(String[] args) {
        // AUTBOXING: primitive -> wrapper automatically
        Integer numObj = 100; // same as Integer.valueOf(100)
        Double piObj = 3.14159; // same as Double.valueOf(3.14159)

        // UNBOXING: wrapper -> primitive automatically
        int num = numObj; // same as numObj.intValue()
        double pi = piObj; // same as piObj.doubleValue()

        System.out.println("numObj (Wrapper): " + numObj);
        System.out.println("piObj (Wrapper): " + piObj);
        System.out.println("num (Primitive): " + num);
        System.out.println("pi (Primitive): " + pi);

        // Autoboxing in collections
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(5); // primitive 5 is autoboxed to Integer
        list.add(10);
        list.add(15);

        System.out.println("ArrayList of Integers: " + list);

        // Unboxing while reading
        int sum = 0;
        for (Integer i : list) { // i is unboxed automatically
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
