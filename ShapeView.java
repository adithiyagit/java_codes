import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShapeView {
    ComboBox<String> shapeSelector = new ComboBox<>();
    Button drawButton = new Button("Draw Shape");
    Button clearButton = new Button("Clear All");
    Label countLabel = new Label("Shapes: 0");
    Pane canvas = new Pane();
    ColorPicker colorPicker = new ColorPicker(Color.SKYBLUE); // Extra credit

    private final VBox root;

    public ShapeView(Stage stage) {
        shapeSelector.getItems().addAll("Circle", "Rectangle");
        shapeSelector.setValue("Circle");

        HBox controls = new HBox(10, new Label("Shape:"), shapeSelector, colorPicker, drawButton, clearButton);
        controls.setStyle("-fx-padding: 10; -fx-alignment: center;");

        canvas.setPrefSize(400, 300);
        canvas.setStyle("-fx-border-color: gray; -fx-background-color: white;");

        root = new VBox(10, controls, canvas, countLabel);
        root.setStyle("-fx-padding: 10; -fx-alignment: center;");

        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Shape Drawer Application");
        stage.setScene(scene);
        stage.show();
    }

    public VBox getRoot() {
        return root;
    }
}
