public class Reta {
    private static final double EPS = 1e-9; 
    private double a; 
    private double b; 

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Reta(Ponto2D p1, Ponto2D p2) {
        if (p1.getX() == p2.getX()) {
            throw new IllegalArgumentException(
                "Reta vertical não pode ser escrita como y = ax + b");
        }
        this.a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.b = p1.getY() - this.a * p1.getX();
    }

    public double getA() { return a; }
    public double getB() { return b; }

    public boolean contem(Ponto2D p) {
        return Math.abs(a * p.getX() + b - p.getY()) < EPS;
    }

    @Override
    public String toString() {
        String texto = "y = " + a + "x";
        if (b >= 0) {
            return texto + " + " + b;
        }
        return texto + " - " + (-b);
    }

    public Ponto2D intersecao(Reta outra) {
        if (Math.abs(this.a - outra.a) < EPS) {
            return null; 
        }
        double x = (outra.b - this.b) / (this.a - outra.a);
        double y = this.a * x + this.b;
        return new Ponto2D(x, y);
    }
}