package MemoryPool;

import SingletonBook.BorrowBook;

public class Bullet {
    public static int counter = 0;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Bullet() {
        counter++;
    }
    public void move(){
        position++;
    }
}
