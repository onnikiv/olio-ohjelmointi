package VirtualDictionary.View;


import java.util.HashMap;

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
    private TextField textField = new TextField();
    private Label searchResult = new Label("Search Result:");

    private FlowPane pane = new FlowPane();

    @Override
    public void start(Stage stage) {
        
        Button searchButton = new Button("Search");

        stage.setTitle("Sanakirja");
        
        pane.setPrefWidth(400);
        pane.setPrefHeight(300);
        
        textField.setLayoutX(10);
        textField.setLayoutY(10);
        searchButton.setLayoutX(10);
        searchButton.setLayoutY(40);
        searchResult.setLayoutX(10);
        searchResult.setLayoutY(70);
        
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

    // jauwza
    public void setDictionaryToInterface() {
        HashMap<String, String> dictionary = controller.getWholeDictionary();
        
        int yPositio = 100;

        for (String key : dictionary.keySet()) {
            Label wordLabel = new Label(key);
            wordLabel.setLayoutX(200);
            wordLabel.setLayoutY(yPositio);
            pane.getChildren().add(wordLabel);
            yPositio += 20;
        }
        
    }
}
