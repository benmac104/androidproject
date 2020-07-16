package com.example.androidproject;

import java.io.IOException;

public class knight {
    private int x, y;


    public void setKnight(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
        return false;
    }
    // Overriding swap() to compare two Complex objects

    public knight swap(knight o) {
        this.setKnight(o.getX(),o.getY());
        return this;
    }

    //check if x1,y1 or x2,y2 inside the board
    public boolean isinside(int x1,int x2,int y1,int y2){
        if(x1<0||x1>7||x2<0||x2>7||y1<0||y1>7||y2<0||y2>7){
            return false;}
        return true;
    }

    //get start position and finish position and return the min steps to get from one to the other
    public String getSteps(knight start, knight fin) {
        StringBuilder str = new StringBuilder();
        int[][] board =new int[8][8];
        knight temp=new knight();
        int x, y, tx, ty,h, minc = 1;
        x=start.getX();
        y = start.getY();
        tx = fin.getX();
        ty = fin.getY();
        int x1, x2, y1, y2;
        h = x;
        if(x==tx&&y==ty)
            return String.valueOf(0);

        if (tx > x&&ty<=y) {
            temp.swap(start);
            start.swap(fin);
            fin.swap(temp);
            x=start.getX();
            y = start.getY();
            tx = fin.getX();
            ty = fin.getY();
            h = x;
        }

        while (!(start.equals(fin)))
        {
            if (x < tx||x-1<0) {
                if (y < ty) {
                    x1 = x + 2;
                    y1 = y + 1;
                    x2 = x + 1;
                    y2 = y + 2; }
                else {
                    x1 = x + 2;
                    y1 = y - 1;
                    x2 = x + 1;
                    y2 = y - 2; } }
            else {
                if (y < ty) {
                    x1 = x - 2;
                    y1 = y + 1;
                    x2 = x - 1;
                    y2 = y + 2;
                } else {
                    x1 = x - 2;
                    y1 = y - 1;
                    x2 = x - 1;
                    y2 = y - 2;
                }
            }
            if ((x1 == tx && y1 == ty) ||
                    (x2 == tx && y2 == ty))
            {
                if(str.toString().equals("")) {
                    str = new StringBuilder("0");
                }
                str.append(" min move:").append(minc);
                return str.toString();
            }
            if (isinside(x1,x2,y1,y2)&&board[x1][y1]== 0&&board[x2][y2]==0) {
                if (x1 < x2||tx<h) {
                    board[x1][y1] =1;
                    x = x1;
                    y = y1; }
                else {
                    board[x2][y2] =1;
                    x = x2;
                    y = y2;}

                start.setKnight(x,y);
                str.append("  "+x + ',' + y);
                minc++; }
            else if (x1 >= 8 || x1 < 0||board[x1][x2]!=0) {
                board[x2][y2] =1;
                x = x2;
                y = y2;
                start.setKnight(x,y);
                str.append("  "+x + ',' + y);
                minc++; }
            else {
                board[x1][y1] =1;
                x = x1;
                y = y1;
                start.setKnight(x,y);
                str.append("  "+x + ',' + y);
                minc++; }
        }
        str.append(" min move:").append(minc);
        return str.toString();}
}
