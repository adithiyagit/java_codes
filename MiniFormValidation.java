import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MiniFormValidation extends Application {

    @Override
    public void start(Stage stage) {
        // Email input field
        TextField emailField = new TextField();
        emailField.setPromptText("Enter email");

        // Status label
        Label statusLabel = new Label();

        // Submit button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String input = emailField.getText();
            if (input.contains("@") && input.contains(".")) {
                statusLabel.setText("Valid");
                statusLabel.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");
            } else {
                statusLabel.setText("Invalid");
                statusLabel.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
            }
        });

        // Layout
        VBox root = new VBox(15, emailField, submitButton, statusLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Mini Form Validation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
