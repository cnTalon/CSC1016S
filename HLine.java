// Assignment 8
// Exercise 2
// 16 October 2022

public class HLine extends VectorObject {
    private int length;
    public HLine(int anId, int ax, int ay, int length) {
        super(anId, ax, ay);
        this.length = length;
    }

    public void draw(char [][] matrix) {
        for(int i = 0; i < length; i++) {
            matrix[super.y][i + super.x] = '*';
        }
    }
}
