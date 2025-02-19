package view;


import controller.CurrencyController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CurrencyView extends  Application{

    private CurrencyController controller;
    private final ChoiceBox<String> initialCurrency = new ChoiceBox<>();
    private final ChoiceBox<String> convertToCurrency = new ChoiceBox<>();
    private final TextField currencyInput = new TextField();

    @Override
    public void start(Stage stage) {
        
        // KOKO HÖSKÄ
        BorderPane layout = new BorderPane();
        layout.setPrefSize(500, 250);

        // TOP
        HBox top = new HBox();
        
        initialCurrency.getItems().addAll("EUR", "USD", "GBP", "SEK");
        convertToCurrency.getItems().addAll("EUR", "USD", "GBP", "SEK");

        top.getChildren().add(initialCurrency);
        top.getChildren().add(new Text("to"));
        top.getChildren().add(convertToCurrency);

        layout.setTop(top);

        // RIGHT
        VBox right = new VBox();
        right.getChildren().add(currencyInput);
        Button convertButton = new Button("Convert"); right.getChildren().add(convertButton);
        layout.setLeft(right);

        // CENTER
        StackPane center = new StackPane();
        center.getChildren().add(new Text("Result: "));
        layout.setCenter(center);
        
        // SCENE
        Scene view = new Scene(layout);
        stage.setTitle("Currency Converter ");
        stage.setScene(view);
        stage.show();

        convertButton.setOnAction((ActionEvent event) -> {
               controller.convertCurrencies();

        });
        
        stage.show();


    }

    @Override
    public void init() {
        controller = new CurrencyController(this);
    }

    public String convertFrom() {
        return initialCurrency.getValue();  
    }

    public String convertTo(){
        return convertToCurrency.getValue();
    }

    public String amountOf() {
        return currencyInput.getText();
    
    }

}
