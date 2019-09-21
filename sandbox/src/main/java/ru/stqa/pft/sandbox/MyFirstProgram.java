package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexei");

    Square s = new Square(6);

    System.out.println("Площадь квадрата со стороной "+s.l+" равна "+aria(s));

    Rectangle r = new Rectangle(4,6);

    System.out.println("Площадь квадрата со сторонами "+r.a+" и "+r.b+" равна "+aria(r));

  }
    public static void hello (String samebody) {
      System.out.println("Hello, "+samebody+"!");
    }
    public static double aria (Square s){
    return s.l*s.l;
    }
    public static double aria (Rectangle r){
    return r.a*r.b;
    }

}