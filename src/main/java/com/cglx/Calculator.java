package com.cglx;

public class Calculator {

    public Calculator() {
    }

    public int add(int a, int b)
    {
    	System.out.println("add");
    	return a+b;
    }

    public int multiply(int a, int b)
    {
    	System.out.println("multiply");
        return a*b;
    }

    public  int divide(int a, int b)
    {
    	System.out.println("divide");
        return a/b;
    }

    public int substract(int a, int b)
    {
    	System.out.println("substract");
        return a - b;
    }

    public int square(int aa)
    {
    	System.out.println("square");
        return aa*aa;
    }
    public boolean areEqual(int f11, int f12) {
    	System.out.println("equal");
        return f11 == f12;
    }
    public void printInt(int f11, int f12) {
    	System.out.println("f11:" + f11 + "f12:" + f12);
    }
    public void printFloat(float f11, float f12) {
    	System.out.println("f11:" + f11 + "f12:" + f12);
    }
    public void printString(String name) {
    	System.out.println(name);
    }
    public void print(int f11, int f12) {
    	System.out.println("f11:" + f11 + "f12:" + f12);
    }
}
