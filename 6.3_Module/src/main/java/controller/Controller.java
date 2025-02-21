package controller;

import model.Pet;
import view.PetGui;

public class Controller {

    private final Pet pet;
    private final PetGui gui;

    public Controller(PetGui gui) {
        this.pet = new Pet(0,0);
        this.gui = gui;

    }

    public void handleMove(int x, int y) {
        System.out.println(" X: " + x + " Y: " + y);
        

        if (x != pet.getX() || y != pet.getY()) { 
            pet.move(x,y);
            gui.updateCanvas();

        }

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
