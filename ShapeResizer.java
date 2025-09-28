import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShapeResizer extends Application {

    @Override
    public void start(Stage stage) {
        // Circle with initial radius
        Circle circle = new Circle(50, Color.SKYBLUE);

        // Slider (10–100)
        Slider slider = new Slider(10, 100, 50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        // Label bound to slider value (rounded)
        Label radiusLabel = new Label();
        radiusLabel.textProperty().bind(
                Bindings.format("Radius: %.0f", slider.valueProperty())
        );

        // Binding: circle radius follows slider value
        circle.radiusProperty().bind(slider.valueProperty());

        // Layout
        VBox root = new VBox(20, circle, slider, radiusLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Simple Shape Resizer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
