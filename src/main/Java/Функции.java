public class Функции {
    public static void main(String[] args) {
        Привет("Пока");
        Привет("дай денег");
        Привет("hello");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со стороной " + r.a + " и " +  r.b + "= " + area(r));
    }
    public static void Привет(String sombody) {
        System.out.println("Привет "  +  sombody + "!" );
    }
    public static double area (Square s ) {
        return s.l * s.l;
    }
    public static double area (Rectangle r)
    {return r.a * r.b;}

}
