package org.example;

public class Calculator {
    public Calculator () {

    }
    public double sum(double x, double y) {
        return x+y;
    }
    public int area( int length , int height ) {
        return length*height;
    }
    public int perimeter ( int length , int height ) {
        return length*2+height*2;
    }
    public boolean isTriangle ( int a , int b, int c ) {
        if(a+b<=c){
            return false;
        }
        if(c+b<=a){
            return false;
        }
        if(a+c<=b){
            return false;
        }
        return true;
    }

}
