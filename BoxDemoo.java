import java.util.Scanner;

class Box {
    int height;
    int width;

    // Method to set height and width
    void setDimensions(int h, int w) {
        height = h;
        width = w;
    }

    // Method to display height and width
    void show() {
        System.out.println("Box Height: " + height);
        System.out.println("Box Width: " + width);
    }
}

public class BoxDemoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of Box class
        Box b1 = new Box();

        // Get user input
        System.out.print("Enter height of the box: ");
        int h = scanner.nextInt();

        System.out.print("Enter width of the box: ");
        int w = scanner.nextInt();

        // Call methods using b1 object
        b1.setDimensions(h, w);
        b1.show();
    }
}