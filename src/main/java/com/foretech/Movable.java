package com.foretech;

public interface Movable {

    int PLAIN_X_MAX = 1000;
    int PLAIN_Y_MAX = 1000;
    int PLAIN_X_MIN = -1000;
    int PLAIN_Y_MIN = -1000;

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

    void moveUp(int howMuch);

    void moveDown(int howMuch);

    void moveLeft(int howMuch);

    void moveRight(int howMuch);

}
