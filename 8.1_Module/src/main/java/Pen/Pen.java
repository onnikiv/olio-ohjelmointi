package Pen;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color;
    private boolean capOn = true;

    public Pen() {
        this.color = Color.RED;
    }

    public Pen(Color color) {
        this.color = color;
    }

    // Write code here
    public void capOff() {
        this.capOn = false;
    }

    public void capOn() {
        this.capOn = true;
    }

    public String draw() {
        return capOn ? "" : "Drawing " + color;
    }

    public void changeColor(Color color) {
        this.color = capOn ? color : this.color;
    }
}