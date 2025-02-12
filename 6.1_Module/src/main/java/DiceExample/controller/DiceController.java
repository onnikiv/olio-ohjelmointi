package DiceExample.controller;

import DiceExample.model.Dice;
import DiceExample.view.DiceGUI;

public class DiceController {

    private DiceGUI gui;
    private Dice dice = new Dice(6);

    public DiceController(DiceGUI gui) {
        this.gui = gui;
    }

    public void cast() {
        int sides = gui.getSides();
        dice.setSides(sides);
        int result = dice.cast();
        gui.setResult(result);
    }
}
