public class Circulo {
    private double raio;
    private Ponto2D centro;

    public Circulo(double raio, Ponto2D centro) {
        this.raio = raio;
        this.centro = new Ponto2D(centro); 
    }

    public Circulo(double raio) {
        this(raio, new Ponto2D()); 
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    public void inflar(double valor) {
        raio += valor;
    }

    public void desinflar(double valor) {
        raio = Math.max(0, raio - valor); 
    }

    public void inflar() {
        inflar(1);
    }

    public void desinflar() {
        desinflar(1);
    }

    public void mover() {
        centro.mover();
    }

    public void mover(double x, double y) {
        centro.mover(x, y);
    }

    public void mover(Ponto2D destino) {
        centro.mover(destino);
    }

    public double area() {
        return Math.PI * raio * raio;
    }
}