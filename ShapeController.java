import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ShapeController {
    private final ShapeModel model;
    private final ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;

        // Bind count label text to model
        view.countLabel.textProperty().bind(model.shapeCountProperty().asString("Shapes: %d"));

        // Shape type selection
        view.shapeSelector.valueProperty().addListener((obs, oldVal, newVal) -> model.setShapeType(newVal));

        // Draw Shape
        view.drawButton.setOnAction(e -> {
            String type = model.getShapeType();
            Color color = view.colorPicker.getValue();

            if ("Circle".equals(type)) {
                Circle circle = new Circle(50, color);
                circle.setCenterX(Math.random() * (view.canvas.getWidth() - 100) + 50);
                circle.setCenterY(Math.random() * (view.canvas.getHeight() - 100) + 50);
                view.canvas.getChildren().add(circle);
            } else {
                Rectangle rect = new Rectangle(80, 50, color);
                rect.setX(Math.random() * (view.canvas.getWidth() - 80));
                rect.setY(Math.random() * (view.canvas.getHeight() - 50));
                view.canvas.getChildren().add(rect);
            }

            model.incrementCount();
        });

        // Clear All
        view.clearButton.setOnAction(e -> {
            view.canvas.getChildren().clear();
            model.resetCount();
        });
    }
}
