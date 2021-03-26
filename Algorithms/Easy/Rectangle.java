package Algorithms.Easy;

public class Rectangle {
    int leftX;
    int bottomY;
    int width;
    int height;

    public Rectangle(int x, int y, int w, int h){
        this.leftX = x;
        this.bottomY = y;
        this.width = w;
        this.height = h;
    }

    public Rectangle(){
        this.leftX = 0;
        this.bottomY = 0;
        this.width = 0;
        this.height = 0;
    }
}
