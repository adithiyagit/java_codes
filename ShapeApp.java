import javafx.application.Application;
import javafx.stage.Stage;

public class ShapeApp extends Application {
    @Override
    public void start(Stage stage) {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView(stage);
        new ShapeController(model, view);
    }

    public static void main(String[] args) {
        launch();
    }
}
