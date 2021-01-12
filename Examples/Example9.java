package Examples;

public class Example9 {
    public static void main(String[] args) {
        Complex f1, f2;
        f1 = new Complex(2,3);
        f2 = new Complex(2,-3);

        f1.show();
        f2.show();
        f1.add(f2).show();
        f1.add(2).show();
        f1.sub(f2).show();
        f1.sub(2).show();
    }
}

class Complex {
    double r, v;
    Complex (double r, double v) {
        this.r = r;
        this.v = v;
    }
    Complex() {
        this(0, 0);
    }
    void show() {
        if (r!=0 && v!=0) {
            if (v>0) {
                System.out.println(r + "+" + v + "i");
            } else {
                System.out.println(r + "-" + (-v) + "i");
            }
        } else if (v!=0) {
            System.out.println(v + "i");
        } else {
            System.out.println(r);
        }
    }
    Complex add(Complex f) {
        return new Complex(r+f.r, v+f.v);
    }
    Complex add(double x) {
        return new Complex(r+x, v);
    }
    Complex sub(Complex f) {
        return new Complex(r-f.r, v-f.v);
    }
    Complex sub(double x) {
        return new Complex(r-x, v);
    }
}
