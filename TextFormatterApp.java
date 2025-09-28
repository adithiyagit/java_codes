import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TextFormatterApp extends Application {

    @Override
    public void start(Stage stage) {
        // Label with default text
        Label sampleLabel = new Label("Sample Text");
        sampleLabel.setFont(Font.font("Arial", 16));

        // ChoiceBox for font style
        ChoiceBox<String> styleChoice = new ChoiceBox<>();
        styleChoice.getItems().addAll("Normal", "Bold", "Italic", "Bold Italic");
        styleChoice.setValue("Normal");

        // Slider for font size (10–36)
        Slider sizeSlider = new Slider(10, 36, 16);
        sizeSlider.setShowTickLabels(true);
        sizeSlider.setShowTickMarks(true);

        // Listener: update font whenever style or size changes
        styleChoice.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            updateFont(sampleLabel, styleChoice.getValue(), sizeSlider.getValue());
        });

        sizeSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateFont(sampleLabel, styleChoice.getValue(), newVal.doubleValue());
        });

        VBox root = new VBox(15, sampleLabel, styleChoice, sizeSlider);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Simple Text Formatter");
        stage.setScene(scene);
        stage.show();
    }

    // Helper: apply font style and size
    private void updateFont(Label label, String style, double size) {
        FontWeight weight = FontWeight.NORMAL;
        FontPosture posture = FontPosture.REGULAR;

        switch (style) {
            case "Bold":
                weight = FontWeight.BOLD;
                break;
            case "Italic":
                posture = FontPosture.ITALIC;
                break;
            case "Bold Italic":
                weight = FontWeight.BOLD;
                posture = FontPosture.ITALIC;
                break;
        }
        label.setFont(Font.font("Arial", weight, posture, size));
    }

    public static void main(String[] args) {
        launch();
    }
}
