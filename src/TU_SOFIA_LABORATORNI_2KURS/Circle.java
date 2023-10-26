package TU_SOFIA_LABORATORNI_2KURS;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }
}
