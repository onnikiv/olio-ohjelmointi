package view;


import controller.CurrencyController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CurrencyView extends  Application{

    private CurrencyController controller;
    private final ChoiceBox<String> initialCurrency = new ChoiceBox<>();
    private final ChoiceBox<String> convertToCurrency = new ChoiceBox<>();
    private final TextField currencyInput = new TextField();
    private final Text resultField = new Text();
    private final Button convertButton = new Button("Convert"); 

    @Override
    public void start(Stage stage) {

        initialCurrency.getItems().addAll("EUR", "USD", "GBP", "SEK");
        convertToCurrency.getItems().addAll("EUR", "USD", "GBP", "SEK");
        
        // KOKO HÖSKÄ
        TilePane layout = new TilePane();
        layout.setMinHeight(300);
        layout.getStyleClass().add("layout");

        // AMOUNT
        VBox amount = new VBox();
        amount.setAlignment(Pos.CENTER);
        amount.getStyleClass().add("amount");

        amount.getChildren().add(new Text("Amount:"));
        amount.getChildren().add(currencyInput);
        layout.getChildren().add(amount);

        // CURRENCY 1
        VBox from = new VBox();
        from.setAlignment(Pos.CENTER);
        from.getStyleClass().add("from");

        from.getChildren().add(new Text("From this Currency"));
        from.getChildren().add(initialCurrency);
        layout.getChildren().add(from);

        // CURRENCY 2
        VBox into = new VBox();
        into.setAlignment(Pos.CENTER);
        into.getStyleClass().add("into");

        into.getChildren().add(new Text("To this Currency"));
        into.getChildren().add(convertToCurrency);
        layout.getChildren().add(into);

        // CONVERT BUTTON
        VBox buttonBox = new VBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getStyleClass().add("buttonBox");

        buttonBox.getChildren().add(convertButton);
        layout.getChildren().add(buttonBox);

        // RESULT
        VBox result = new VBox();
        result.setAlignment(Pos.CENTER);
        result.getStyleClass().add("result");

        result.getChildren().add(new Text("Result"));
        result.getChildren().add(resultField);
        layout.getChildren().add(result);

        // SCENE
        Scene view = new Scene(layout);
        view.getStylesheets().add("styles.css");
        stage.setTitle("Currency Converter ");
        stage.setScene(view);
        stage.sizeToScene();
        stage.show();

        // BUTTON ACTION
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

    public void setResult(double result) {
        resultField.setText(String.format("%.2f", result));
    }
}
