import java.io.*;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            String line = reader.readLine();
            int number = Integer.parseInt(line); // Could throw NumberFormatException
            int out = 100 / number; // Could throw ArithmeticException
            System.out.println("Result is: " + out);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Error reading file.");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        } catch (NumberFormatException e) {
            System.out.println("Line is not a number!");
        }
    }
}
