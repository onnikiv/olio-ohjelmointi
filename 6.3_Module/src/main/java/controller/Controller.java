package controller;

import javafx.application.Platform;
import model.Pet;
import view.PetGui;

public class Controller {

    private final Pet pet;
    private final PetGui gui;

    private int cursorX;
    private int cursorY;

    private boolean moving;

    public Controller(PetGui gui) {
        this.pet = new Pet(0,0);
        this.gui = gui;
        this.moving = false;

    }

    public synchronized void handleMove(int x, int y) {
        System.out.println(" X: " + x + " Y: " + y);
        this.cursorX = x;
        this.cursorY = y;

        if (!moving) {
            moving = true;
            new Thread(() -> {
                while (true) {
                    synchronized (this) {
                        if (pet.getX() == cursorX && pet.getY() == cursorY) {
                            moving = false;
                            break;
                        }
                        if (pet.getX() < cursorX) { pet.setX(pet.getX() + 1); }
                        if (pet.getX() > cursorX) { pet.setX(pet.getX() - 1); }
                        if (pet.getY() < cursorY) { pet.setY(pet.getY() + 1); }
                        if (pet.getY() > cursorY) { pet.setY(pet.getY() - 1); }
                    }

                    Platform.runLater(() -> gui.updateCanvas());

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }).start();
        }
    }

    public void startComputation(int x, int y) {
        Platform.runLater(() -> handleMove(x, y));
        gui.updateCanvas();
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
