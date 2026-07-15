public class Функции {
    public static void main(String[] args) {
        Привет("Пока");
        Привет("дай денег");
        Привет("hello");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со стороной " + r.a + " и " +  r.b + "= " + r.area());
    }
    public static void Привет(String sombody) {
        System.out.println("Привет "  +  sombody + "!" );
    }

    }
