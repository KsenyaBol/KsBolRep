package ru.stqa.pft.sandbox;
public class First {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Ksusha");

    Point p1 = new Point(3, 4);
    Point p2 = new Point(6, 9);
    System.out.println("Расстояние между двумя точками с координатами " + p1.x1 + "," + p1.y1 + " и " + p2.x2 + "," + p2.y2 + " = " + d.distance());

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}

