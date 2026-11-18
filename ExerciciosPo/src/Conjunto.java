import java.util.Arrays;

public class Conjunto {
    private String[] elementos = new String[2]; 
    private int tamanho = 0;                    

    public int tamanho() { return tamanho; }

    public String obter(int i) { return elementos[i]; }

    public boolean adicionar(String elemento) {
        if (contem(elemento)) {
            return false; 
        }
        if (tamanho == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2); 
        }
        elementos[tamanho] = elemento;
        tamanho++;
        return true;
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            resultado.adicionar(this.elementos[i]);
        }
        for (int i = 0; i < outro.tamanho; i++) {
            resultado.adicionar(outro.elementos[i]); 
        }
        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            if (outro.contem(this.elementos[i])) {
                resultado.adicionar(this.elementos[i]);
            }
        }
        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            if (!outro.contem(this.elementos[i])) {
                resultado.adicionar(this.elementos[i]);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        String texto = "{";
        for (int i = 0; i < tamanho; i++) {
            texto += elementos[i];
            if (i < tamanho - 1) texto += ", ";
        }
        return texto + "}";
    }
}