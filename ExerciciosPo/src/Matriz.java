public class Matriz {
    private double[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new double[linhas][colunas];
    }

    public int getLinhas() { return linhas; }
    public int getColunas() { return colunas; }

    public double get(int i, int j) { return dados[i][j]; }
    public void set(int i, int j, double valor) { dados[i][j] = valor; }

    private boolean ehQuadrada() {
        return linhas == colunas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matriz)) return false;
        Matriz m = (Matriz) o;
        if (linhas != m.linhas || colunas != m.colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (dados[i][j] != m.dados[i][j]) return false;
            }
        }
        return true;
    }

    public Matriz transposta() {
        Matriz t = new Matriz(colunas, linhas); 
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                t.dados[j][i] = dados[i][j];
            }
        }
        return t;
    }

    public Matriz oposta() {
        Matriz r = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                r.dados[i][j] = -dados[i][j];
            }
        }
        return r;
    }

    public Matriz gerarNula() {
        return new Matriz(linhas, colunas); 
    }

    public boolean ehIdentidade() {
        if (!ehQuadrada()) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                double esperado = (i == j) ? 1 : 0;
                if (dados[i][j] != esperado) return false;
            }
        }
        return true;
    }

    public boolean ehDiagonal() {
        if (!ehQuadrada()) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && dados[i][j] != 0) return false;
            }
        }
        return true;
    }

    public boolean ehSingular() {
        if (!ehDiagonal()) return false;
        for (int i = 1; i < linhas; i++) {
            if (dados[i][i] != dados[0][0]) return false;
        }
        return true;
    }

    public boolean ehSimetrica() {
        return ehQuadrada() && this.equals(transposta());
    }

    public boolean ehAntiSimetrica() {
        return ehQuadrada() && oposta().equals(transposta());
    }

    public void somar(Matriz o) {
        verificarMesmasDimensoes(o);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] += o.dados[i][j];
            }
        }
    }

    public void subtrair(Matriz o) {
        verificarMesmasDimensoes(o);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] -= o.dados[i][j];
            }
        }
    }

    public void multiplicar(Matriz o) {
        if (this.colunas != o.linhas) {
            throw new IllegalArgumentException(
                "Colunas da 1ª matriz devem ser iguais às linhas da 2ª");
        }
        double[][] resultado = new double[this.linhas][o.colunas];
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < o.colunas; j++) {
                double soma = 0;
                for (int k = 0; k < this.colunas; k++) {
                    soma += this.dados[i][k] * o.dados[k][j];
                }
                resultado[i][j] = soma;
            }
        }
        this.dados = resultado;
        this.colunas = o.colunas; 
    }

    public Matriz copia() {
        Matriz c = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                c.dados[i][j] = dados[i][j];
            }
        }
        return c;
    }

    private void verificarMesmasDimensoes(Matriz o) {
        if (linhas != o.linhas || colunas != o.colunas) {
            throw new IllegalArgumentException("Matrizes de dimensões diferentes");
        }
    }

    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                texto += dados[i][j] + "\t";
            }
            texto += "\n";
        }
        return texto;
    }
}