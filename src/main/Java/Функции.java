public class Функции {
    public static void main(String[] args) {
        Привет("Пока");
        Привет("дай денег");
        Привет("hello");
    double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));
        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со стороной " + a + "и" + b + "= " + area(a, b));
    }
    public static void Привет(String sombody) {
        System.out.println("Привет "  +  sombody + "!" );
    }
    public static double area (double l) {
        return l * l;
    }
    public static double area (double a, double b)
    {return a * b;}



}
