package com.Comparison;

public class Comparison<T extends Comparable<T>> {

    T x,y,z;
    public Comparison(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

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

    // to find the largest of  three Float  objects.
    public static Float largest(Float x, Float y, Float z) {
        Float max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;
    }

    public static String maximum(String x, String y, String z) {
        String max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;
    }

    // generic method to determine the greatest of comparable objects.
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;
    }
    public T maximum(){
        return Comparison.maximum(x,y,z);
    }

    public static void main(String[] args) {
        Integer xInt  = 41, yInt = 521, zInt = 68;
        Integer max =  new Comparison().largest (xInt,yInt,zInt);
        System.out.println("The largest is "+max);
        Float xFloat  = 4.4f, yFloat =4.5f, zFloat = 4.6f;
        Float max1 =  new Comparison().largest(xFloat,yFloat,zFloat);
        System.out.println("The maximum  Element is "+max);
        String xString = "Yash",yString = "Wardhan",zString = "Qzaxa";
        String max2 = new Comparison().maximum(xString,yString,zString);
        System.out.println(max);
    }
}
