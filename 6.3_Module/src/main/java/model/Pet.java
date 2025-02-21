package model;


public class Pet {

    private int x;
    private int y;
    private static final int GRID_SIZE = 10;
    private final int MOVEMENT_SPEED = 10; // 10ms

    public Pet(int x, int y) {
        this.x = x;
        this.y = y;
        } 

    public void move(int x, int y) {
        if (this.x != x) {
            if (x >= this.x) {
            this.x++;
            } else {
            this.x--;
            }
        }

        if (this.y != y) {
            if (y >= this.y) {
            this.y++;
            } else {
            this.y--;
            }
        }

        try {
            Thread.sleep(MOVEMENT_SPEED);
        } catch (InterruptedException e) {
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