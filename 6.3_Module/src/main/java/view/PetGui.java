package view;


import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PetGui extends Application {


    private Controller controller;
    private Canvas canvas;
    private GraphicsContext gc;

    private final int WIDTH = 500;
    private final int HEIGHT = 250;

    @Override
    public void init() {
        controller = new Controller(this);
    }


    @Override
    public void start(Stage stage) {

        canvas = new Canvas(WIDTH, HEIGHT);
        gc = canvas.getGraphicsContext2D();



        

        canvas.setOnMouseMoved(event -> {

            controller.handleMove((int)event.getX(), (int)event.getY());
        });

        

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setTitle("Virtual Pet");
        stage.setScene(scene);
        stage.show();

        updateCanvas();
 
    }

    public void updateCanvas() {

        gc.clearRect(0, 0, WIDTH, HEIGHT);

        gc.setFill(Color.BLUE);
        int x = controller.getPetX();
        int y = controller.getPetY();
        gc.fillRect(x, y, 10, 10);
    }

}
