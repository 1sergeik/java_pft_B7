package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexei");
    double len=6;
    System.out.println("Площадь квадрата со стороной "+len+" равна "+aria(len));

    double a=4;
    double b=6;
    System.out.println("Площадь квадрата со сторонами "+a+" и "+b+" равна "+aria(a,b));

  }
    public static void hello (String samebody) {
      System.out.println("Hello, "+samebody+"!");
    }
    public static double aria (double l){
    return l*l;
    }
    public static double aria (double a, double b){
    return a*b;
    }

}