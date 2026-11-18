public class NumeroComplexo {
    private double real;
    private double imaginaria;

    
    public NumeroComplexo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() { return real; }
    public double getImaginaria() { return imaginaria; }
    public void setReal(double real) { this.real = real; }
    public void setImaginaria(double imaginaria) { this.imaginaria = imaginaria; }

    public NumeroComplexo somar(NumeroComplexo o) {
        return new NumeroComplexo(real + o.real, imaginaria + o.imaginaria);
    }

    public NumeroComplexo subtrair(NumeroComplexo o) {
        return new NumeroComplexo(real - o.real, imaginaria - o.imaginaria);
    }

    public NumeroComplexo multiplicar(NumeroComplexo o) {
        double r = real * o.real - imaginaria * o.imaginaria;
        double i = real * o.imaginaria + imaginaria * o.real;
        return new NumeroComplexo(r, i);
    }

    public NumeroComplexo dividir(NumeroComplexo o) {
        double denominador = o.real * o.real + o.imaginaria * o.imaginaria;
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por complexo zero");
        }
        double r = (real * o.real + imaginaria * o.imaginaria) / denominador;
        double i = (imaginaria * o.real - real * o.imaginaria) / denominador;
        return new NumeroComplexo(r, i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeroComplexo)) return false;
        NumeroComplexo c = (NumeroComplexo) o;
        return Double.compare(real, c.real) == 0
            && Double.compare(imaginaria, c.imaginaria) == 0;
    }

    @Override
    public String toString() {
        if (imaginaria >= 0) {
            return real + " + " + imaginaria + "i";
        }
        return real + " - " + (-imaginaria) + "i"; 
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginaria * imaginaria);
    }
}