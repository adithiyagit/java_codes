import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickerDemo extends Application {

    private final Color defaultColor = Color.LIGHTGRAY;

    @Override
    public void start(Stage stage) {
        // Pane with default background
        Pane pane = new Pane();
        pane.setPrefSize(300, 200);
        pane.setStyle("-fx-background-color: " + toRgbString(defaultColor) + ";");

        // ColorPicker
        ColorPicker colorPicker = new ColorPicker(defaultColor);

        // Listener: update pane background when color changes
        colorPicker.setOnAction(e -> 
            pane.setStyle("-fx-background-color: " + toRgbString(colorPicker.getValue()) + ";")
        );

        // Reset Button
        Button resetButton = new Button("Reset");
        resetButton.setOnAction(e -> {
            colorPicker.setValue(defaultColor);
            pane.setStyle("-fx-background-color: " + toRgbString(defaultColor) + ";");
        });

        VBox root = new VBox(15, pane, colorPicker, resetButton);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root);
        stage.setTitle("Color Picker Demo");
        stage.setScene(scene);
        stage.show();
    }

    // Helper: Convert Color to CSS rgb()
    private String toRgbString(Color c) {
        return String.format("rgb(%d,%d,%d)",
                (int) (c.getRed() * 255),
                (int) (c.getGreen() * 255),
                (int) (c.getBlue() * 255));
    }

    public static void main(String[] args) {
        launch();
    }
}
