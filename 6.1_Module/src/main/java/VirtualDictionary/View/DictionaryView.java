package VirtualDictionary.View;


import VirtualDictionary.Controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application{


    private DictionaryController controller;
    private final TextField textField = new TextField();
    private final Label searchResult = new Label("Search Result:");


    @Override
    public void start(Stage stage) {
        
        Button searchButton = new Button("Search");
        FlowPane pane = new FlowPane();


        stage.setTitle("Sanakirja");

        pane.setPrefWidth(400);
        pane.setPrefHeight(300);

        pane.getChildren().add(textField);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(searchResult);

        Scene scene = new Scene(pane);
        
        stage.setScene(scene);

        stage.show();

        searchButton.setOnAction((ActionEvent event) -> {
            
            controller.getTextFieldSearch();

        });

        stage.show();

        
    }
    @Override
    public void init() {
        controller = new DictionaryController(this);
    }

    public String getTextField() {
        return textField.getText().toLowerCase();
            
    }

    public void setSearchResult(String search) {
        this.searchResult.setText(search);
    }
}
