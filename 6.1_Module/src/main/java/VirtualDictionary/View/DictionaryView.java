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
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class DictionaryView extends Application{

    private DictionaryController controller;
    private final TextField textField = new TextField();
    private final Label searchResult = new Label("Search Result:");
    private final FlowPane pane = new FlowPane();

    // testings
    @Override
    public void start(Stage stage) {
        
        Button searchButton = new Button("Search");
        Region gap = new Region();
        gap.setPrefWidth(500);

        stage.setTitle("Sanakirja");
        
        // koko
        pane.setPrefWidth(400);
        pane.setPrefHeight(300);
        pane.setVgap(5);
        pane.setHgap(5);

        pane.getChildren().addAll(searchButton, textField, searchResult);
        pane.getChildren().add(gap);
        
        setDictionaryToInterface(pane);

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
    public void setDictionaryToInterface(FlowPane pane) {
        HashMap<String, String> dictionary = controller.getWholeDictionary();
        
        for (String key : dictionary.keySet()) {
            Label keyWord = new Label(key);
            keyWord.setStyle("-fx-border-color: black;");
            pane.getChildren().add(keyWord);
        }
    }
}
