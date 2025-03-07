package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CurrencyView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CurrencyConverter/DB");
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view.fxml"));
        Parent root = fxmlLoader.load();
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        
        stage.setScene(scene);
        stage.show();
    }
}
