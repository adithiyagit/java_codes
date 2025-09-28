import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.time.LocalDate;

public class JavaFXControlsDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Main layout
        TabPane tabPane = new TabPane();

        // Tab 1: Basic Controls
        Tab basicTab = new Tab("Basic Controls", createBasicControlsPane());
        basicTab.setClosable(false);

        // Tab 2: Advanced Controls
        Tab advancedTab = new Tab("Advanced Controls", createAdvancedControlsPane());
        advancedTab.setClosable(false);

        // Tab 3: Data Controls
        Tab dataTab = new Tab("Data Controls", createDataControlsPane());
        dataTab.setClosable(false);

        tabPane.getTabs().addAll(basicTab, advancedTab, dataTab);

        Scene scene = new Scene(tabPane, 900, 600);
        primaryStage.setTitle("JavaFX Controls Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox createBasicControlsPane() {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        Label label = new Label("This is a Label");

        Button button = new Button("Click Me!");
        button.setOnAction(e -> System.out.println("Button clicked!"));

        TextField textField = new TextField();
        textField.setPromptText("Enter text here");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter password");

        CheckBox checkBox = new CheckBox("Check me");

        ToggleGroup group = new ToggleGroup();
        RadioButton radio1 = new RadioButton("Option 1");
        RadioButton radio2 = new RadioButton("Option 2");
        radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);
        radio1.setSelected(true);

        ToggleButton toggleButton = new ToggleButton("Toggle Me");

        Hyperlink hyperlink = new Hyperlink("Click this link");
        hyperlink.setOnAction(e -> System.out.println("Hyperlink clicked"));

        Tooltip tooltip = new Tooltip("This is a tooltip");
        button.setTooltip(tooltip);

        vbox.getChildren().addAll(
            label, button, textField, passwordField, checkBox,
            new Label("Radio Buttons:"), radio1, radio2,
            toggleButton, hyperlink
        );

        return vbox;
    }

    private VBox createAdvancedControlsPane() {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3");
        choiceBox.setValue("Option 1");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Item 1", "Item 2", "Item 3");
        comboBox.setValue("Item 1");

        Slider slider = new Slider(0, 100, 50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        ProgressBar progressBar = new ProgressBar(0.5);
        ProgressIndicator progressIndicator = new ProgressIndicator(0.5);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(Orientation.HORIZONTAL);
        scrollBar.setMin(0);
        scrollBar.setMax(100);
        scrollBar.setValue(50);

        ColorPicker colorPicker = new ColorPicker(Color.BLUE);

        DatePicker datePicker = new DatePicker(LocalDate.now());

        Separator separator = new Separator();

        vbox.getChildren().addAll(
            new Label("Choice Box:"), choiceBox,
            new Label("Combo Box:"), comboBox,
            new Label("Slider:"), slider,
            new Label("Progress:"), progressBar, progressIndicator,
            new Label("Scroll Bar:"), scrollBar,
            new Label("Color Picker:"), colorPicker,
            new Label("Date Picker:"), datePicker,
            separator
        );

        return vbox;
    }

    private VBox createDataControlsPane() {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Item 1", "Item 2", "Item 3", "Item 4");
        listView.setPrefHeight(100);

        Label scrollContent = new Label("This is content inside a ScrollPane. " +
            "Try resizing the window to see scrolling behavior. ".repeat(5));
        scrollContent.setWrapText(true);
        ScrollPane scrollPane = new ScrollPane(scrollContent);
        scrollPane.setPrefHeight(100);

        TableView<Person> tableView = new TableView<>();
        ObservableList<Person> people = FXCollections.observableArrayList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Bob", 35)
        );

        TableColumn<Person, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Person, Integer> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));

        tableView.getColumns().addAll(nameCol, ageCol);
        tableView.setItems(people);
        tableView.setPrefHeight(150);

        TreeItem<String> root = new TreeItem<>("Root");
        root.getChildren().addAll(
            new TreeItem<>("Child 1"),
            new TreeItem<>("Child 2")
        );
        TreeView<String> treeView = new TreeView<>(root);
        treeView.setPrefHeight(100);

        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(150);

        TitledPane titledPane1 = new TitledPane("Section 1", new Label("Content 1"));
        TitledPane titledPane2 = new TitledPane("Section 2", new Label("Content 2"));
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(titledPane1, titledPane2);

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        openItem.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                System.out.println("Selected file: " + file.getAbsolutePath());
            }
        });
        fileMenu.getItems().add(openItem);
        menuBar.getMenus().add(fileMenu);

        vbox.getChildren().addAll(
            new Label("List View:"), listView,
            new Label("Scroll Pane:"), scrollPane,
            new Label("Table View:"), tableView,
            new Label("Tree View:"), treeView,
            new Label("HTML Editor:"), htmlEditor,
            new Label("Accordion:"), accordion,
            new Label("Menu:"), menuBar
        );

        return vbox;
    }

    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
