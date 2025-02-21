package model;


public class Pet {

    private int x;
    private int y;
    private static final int GRID_SIZE = 10;

    public Pet(int x, int y) {
        this.x = x;
        this.y = y;
        } 

    public void move(int x, int y) {
        // X positio
        if (this.x != x) {
            if (x >= this.x) {
                this.x++;
            } else {
                this.x--;
            }
        }
        // Y positio
        if (this.y != y) {
            if (y >= this.y) {
                this.y++;
            } else {
                this.y--;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getGridSize() {
        return GRID_SIZE;
    }
}