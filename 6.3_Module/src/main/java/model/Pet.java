package model;


public class Pet {

    private int x;
    private int y;

    public Pet(int x, int y) {
        this.x = x;
        this.y = y;
        } 

    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}