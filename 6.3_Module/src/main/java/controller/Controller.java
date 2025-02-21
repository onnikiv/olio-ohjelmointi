package controller;

import javafx.application.Platform;
import model.Pet;
import view.PetGui;

public class Controller {

    private final Pet pet;
    private final PetGui gui;

    private int cursorX;
    private int cursorY;

    public Controller(PetGui gui) {
        this.pet = new Pet(0,0);
        this.gui = gui;

    }

    public synchronized void handleMove(int x, int y) {
        System.out.println(" X: " + x + " Y: " + y);
        try {
            while (x != pet.getX() || y != pet.getY()) { 
                pet.move(x,y);
                gui.updateCanvas();

            }
            
        } catch (Exception e) {
        }
    }

    public void startComputation(int x, int y) {
        new Thread(() -> {
            try {
                
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }

            Platform.runLater(() -> handleMove(x, y));
        }).start();
    }



    public int getPetX() {
        return pet.getX();
    }

    public int getPetY() {
        return pet.getY();
    }

    public int getGridSize() {
        return pet.getGridSize();
    }
}
