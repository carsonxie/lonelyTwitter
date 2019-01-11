package ca.ualberta.cs.lonelytwitter.model;

public abstract class Shape {

    private int x;
    private int y;

    //getter and setter
    public int getX(){
        return x;
    };

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw();





}
