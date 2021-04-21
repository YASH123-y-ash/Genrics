package com.Comparison;

public class Comparison {

    public Comparison() {

    }
    // method to find  largest among three Integer
    public static Integer largest(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;

    }

    public static void main(String[] args) {
        Integer xInt  = 41, yInt = 521, zInt = 68;
        Integer max =  new Comparison().largest (xInt,yInt,zInt);
        System.out.println("The largest is "+max);
    }
}
