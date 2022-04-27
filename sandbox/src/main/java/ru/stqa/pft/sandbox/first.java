package ru.stqa.pft.sandbox;
public class First {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Ksusha");

    /*Point p1 = new Point(3, 4);
    Point p2 = new Point(6, 8);
    System.out.println("расстояние между двумя точками с координаами (" +p1.x + ";" + p1.y + ") и (" + p2.x + ";" + p2.y + ") = " + Point.distance(p1, p2));*/

   /* Point p = new Point(5, 9, 5, 7);
    System.out.println("Расстояние между двумя точками с координатами (" + p.x1 + ";" + p.y1 + ") и (" + p.x2 + ";" + p.y2 + ") = " + p.area());*/

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
 /* public static void main(String[] args) {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(5, 6);
    System.out.println("расстояние между двумя точками = " + Point.distance(p1, p2));
    }*/



