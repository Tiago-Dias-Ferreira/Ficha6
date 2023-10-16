package org.example;

public class Ex6 {
    public Ex6() {}
    public double avgDigits(int x) {
        String temp=Integer.toString(x);
        String temp2;
        int sum=0;
        int count=0;
        for(int i=0;i<temp.length();i++) {
            sum+=Integer.parseInt(temp.substring(i));
            count=1;
        }
        if(count!=0) {
            return sum/count;
        }
        else return 0;
    }
}
