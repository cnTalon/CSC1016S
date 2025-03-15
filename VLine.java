// Assignment 8
// Exercise 2
// 16 October 2022

public class VLine extends VectorObject {
    
    protected int len;

    public VLine(int anId, int ax, int ay, int len) {
        super(anId, ax, ay);
        this.len = len;
    }

    public void draw(char [][] matrix) {
        for (int i = 0; i < len; i++) {
            matrix[super.y + i][super.x] = '*';
        }
    }
}
