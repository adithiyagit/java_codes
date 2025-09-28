import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorSwitcher extends Application {

    private final Color color1 = Color.RED;
    private final Color color2 = Color.BLUE;
    private boolean isColor1 = true;

    private final StringProperty colorNameProperty = new SimpleStringProperty("RED");

    @Override
    public void start(Stage stage) {
        // Rectangle setup
        Rectangle rectangle = new Rectangle(200, 100, color1);

        // Label bound to colorNameProperty
        Label colorLabel = new Label();
        colorLabel.textProperty().bind(colorNameProperty);

        // ToggleButton setup
        ToggleButton toggleButton = new ToggleButton("Switch Color");
        toggleButton.setOnAction(e -> switchColor(rectangle));

        // Layout setup
        VBox root = new VBox(20, rectangle, toggleButton, colorLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Color Switcher");
        stage.setScene(scene);
        stage.show();
    }

    private void switchColor(Rectangle rectangle) {
        if (isColor1) {
            rectangle.setFill(color2);
            colorNameProperty.set("BLUE");
        } else {
            rectangle.setFill(color1);
            colorNameProperty.set("RED");
        }
        isColor1 = !isColor1;
    }

    public static void main(String[] args) {
        launch();
    }
}
