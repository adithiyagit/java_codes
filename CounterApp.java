import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CounterApp extends Application {

    private final IntegerProperty count = new SimpleIntegerProperty(0);

    @Override
    public void start(Stage stage) {
        // Label bound to count property to display current count
        Label countLabel = new Label();
        countLabel.textProperty().bind(count.asString());

        // Increment Button
        Button clickButton = new Button("Click Me");
        clickButton.setOnAction(e -> count.set(count.get() + 1));

        // Reset Button
        Button resetButton = new Button("Reset");
        resetButton.setOnAction(e -> count.set(0));

        // Layout setup
        VBox root = new VBox(15, countLabel, clickButton, resetButton);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 200, 150);
        stage.setTitle("Simple Counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
 