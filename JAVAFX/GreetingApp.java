import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreetingApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // UI elements
        Label instructionLabel = new Label("Enter your name:");
        TextField nameField = new TextField();
        Button greetButton = new Button("Greet");
        Label greetingLabel = new Label();

        // Button action
        greetButton.setOnAction(e -> {
            String name = nameField.getText();
            if (!name.isEmpty()) {
                greetingLabel.setText("Hello, " + name + "!");
            } else {
                greetingLabel.setText("Please enter a name.");
            }
        });

        // Layout
        VBox vbox = new VBox(10); // 10 px spacing
        vbox.getChildren().addAll(instructionLabel, nameField, greetButton, greetingLabel);

        // Scene and stage setup
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("JavaFX Greeting App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
