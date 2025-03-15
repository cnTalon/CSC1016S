// Assignment 8
// Exercise 2
// 16 October 2022

import java.lang.Math;

public class PtLine extends VectorObject {
    //instance vars
    private int y0, x0, y2, x2;
    //constructor
    public PtLine(int anId, int ax, int ay, int x1, int y1) {
        super(anId, ax, ay);
        this.x0 = ax;
        this.y0 = ay;
        this.y2 = y1;   // ending y
        this.x2 = x1;   // ending x
    }
    // method
    public void draw(char [][] matrix) {
        int x = x0;     // beginning x
        int y = y0;     // beginning y
        int y1 = y2;
        int x1 = x2;
        
        // check slope steepness (1)
        boolean steep = Math.abs(y1 - y) > Math.abs(x1 - x);
        if (steep == true) {
            // swap x0 and y0
            int temp = x;
            x = y;
            y = temp;
            // swap x1 and y1
            temp = x1;
            x1 = y1;
            y1 = temp;
        }
        
        if (x > x1) {
            // swap x and x1
            int temp = x;
            x = x1;
            x1 = temp;
            // swap y and y1
            temp = y;
            y = y1;
            y1 = temp;
        }

        // delta x and y for gradient
        int dx = x1 -x;
        int dy = Math.abs(y1 -y);

        // error adjustment
        int yMove;
        int duplicateY = y;
        int error = dx/2;

        if (y < y1) {
            yMove = 1;
        } else {
            yMove = -1;
        }
        // draw
        for (int i = x; i <= x1; i++) {
            if (steep == true) {
                matrix[i][duplicateY] = '*';
            }
            else {
                matrix[duplicateY][i] = '*';
            }
            error -= dy;
            if (error < 0) {
                duplicateY += yMove;
                error += dx;
            }
        }
    }
}
