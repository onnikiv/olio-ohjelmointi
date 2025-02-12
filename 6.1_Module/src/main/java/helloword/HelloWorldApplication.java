package helloword;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

        btn.setOnAction(new EventHandler<ActionEvent>() {
            private int state = 1;
            @Override
            public void handle(ActionEvent actionEvent) {
                switch (state) {
                    case 1: text.setText("Hello World!"); break;
                    case 2: text.setText("Hello Universe!"); break;
                    case 3: text.setText("Hello Multiverse!"); break;

                }
                state++;
                if (state > 3) state = 1;
            }
        });


        window.setTitle("My Greeting Application");
        window.setScene(scene);
        window.show();
    }
}