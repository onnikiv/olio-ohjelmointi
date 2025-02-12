
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {
    @Override
    public void start(Stage window) {
        Label text = new Label("Hello World!");
        Scene view = new Scene(text);
        Button btn = new Button("Press Me!");

        FlowPane componenentGroup = new FlowPane();
        componenentGroup.getChildren().add(text);
        componenentGroup.getChildren().add(btn);
        
        Scene scene = new Scene(componenentGroup);

    btn.setOnAction(event -> {
        System.out.println("Button Pressed!");
    });
    window.setTitle("My Greeting Application");
    window.setScene(scene);
    window.show();
}
}