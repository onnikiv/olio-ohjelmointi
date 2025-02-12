package DiceExample.view;

/*
The application implements an electronic dice that can be used to play board games. The application has a button that rolls the dice. When the user clicks the button, the application generates a random number between 1 and 6 and displays it on the screen. The user interfice also provides the possibility to change the number of sides of the dice. Thus, you can use the application to throw a regular 6-side dice, or, if you wish, a role-player's dice with 20 sides.

 */

import DiceExample.controller.DiceController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Spinner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class DiceGUI extends Application {

    // initialize components that need to be accessed from multiple methods
    private Label result = new Label("0");
    private Spinner<Integer> sidesSpinner = new Spinner<Integer>(1, 20, 6);
    private DiceController controller;

    public void start(Stage stage) {

        Button castButton = new Button("Cast");
        FlowPane pane = new FlowPane();

        stage.setTitle("Dice");

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(result, insets);
        pane.setMargin(castButton, insets);
        pane.setMargin(sidesSpinner, insets);

        // reserve space for result
        result.setMinWidth(30);
        result.setAlignment(Pos.CENTER);

        pane.getChildren().add(sidesSpinner);
        pane.getChildren().add(result);
        pane.getChildren().add(castButton);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        castButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                controller.cast();
            }
        });

        stage.show();
    }


    public void init() {
        controller = new DiceController(this);
    }

    public int getSides() {
        return sidesSpinner.getValue();
    }

    public void setResult(int result) {
        this.result.setText(String.valueOf(result));
    }
}
