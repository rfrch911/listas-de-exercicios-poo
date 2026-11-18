import java.util.Objects;

public class Ponto2D {
    private double x;
    private double y;

    
    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D outro) {
        this.x = outro.x;
        this.y = outro.y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public void mover() {
        this.x = 0;
        this.y = 0;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto2D destino) {
        this.x = destino.x;
        this.y = destino.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;             
        if (!(o instanceof Ponto2D)) return false; 
        Ponto2D p = (Ponto2D) o;                
        return Double.compare(x, p.x) == 0 && Double.compare(y, p.y) == 0;
    }

    @Override
    public int hashCode() { 
        return Objects.hash(x, y);
    }

    // e) Representação em texto
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Distância entre este ponto e outro: raiz((xB-xA)² + (yB-yA)²)
    public double distancia(Ponto2D outro) {
        double dx = outro.x - this.x;
        double dy = outro.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // f) Novo ponto no mesmo local
    @Override
    public Ponto2D clone() {
        return new Ponto2D(this); // reaproveita o construtor de cópia
    }
}