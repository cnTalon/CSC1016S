// Assignment 8
// Exercise 2
// 16 October 2022

public class Rectangle extends VectorObject{
    protected int xLen;
    protected int yLen;
    public Rectangle(int anId, int ax, int ay, int xLen, int yLen) {
        super(anId, ax, ay);
        this.xLen = xLen;
        this.yLen = yLen;
    }

    @Override
    public void draw(char[][] matrix) {
        for (int i = 0; i < yLen; i++) {
            for (int k = 0; k < xLen; k++) {
                matrix[super.y + i][super.x + k] = '*';
            }
        }
        
    }
}
