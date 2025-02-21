package view;


import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PetGui extends Application {


    private Controller controller;
    private Canvas canvas;
    private GraphicsContext gc;

    //image
    private Image petImage;

    private final int WIDTH = 700;
    private final int HEIGHT = 400;

    @Override
    public void init() {
        controller = new Controller(this);
        petImage = new Image("C:\\Users\\onnik\\Ohjelmointi\\olio-ohjelmointi\\6.3_Module\\src\\main\\resources\\petImage.png");
    }


    @Override
    public void start(Stage stage) {

        canvas = new Canvas(WIDTH, HEIGHT);
        gc = canvas.getGraphicsContext2D();



        

        canvas.setOnMouseMoved(event -> {

            controller.startComputation((int)event.getX(), (int)event.getY());

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

        int x = controller.getPetX();
        int y = controller.getPetY();

        gc.drawImage(petImage, x-50, y-50, 100, 100);


    }

}
