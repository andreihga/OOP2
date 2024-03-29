package com.foretech;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveUp(int howMuch) {

    }

    @Override
    public void moveDown(int howMuch) {

    }

    @Override
    public void moveLeft(int howMuch) {

    }

    @Override
    public void moveRight(int howMuch) {

    }
}
