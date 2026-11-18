public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao; 
    private Pais[] fronteiras = new Pais[40]; 
    private int qtdFronteiras = 0;            

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodigoISO() { return codigoISO; }
    public String getNome() { return nome; }
    public long getPopulacao() { return populacao; }
    public double getDimensao() { return dimensao; }
    public void setCodigoISO(String codigoISO) { this.codigoISO = codigoISO; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPopulacao(long populacao) { this.populacao = populacao; }
    public void setDimensao(double dimensao) { this.dimensao = dimensao; }

    public void adicionarFronteira(Pais outro) {
        this.registrar(outro);
        outro.registrar(this);
    }

    private void registrar(Pais outro) {
        if (this.equals(outro) || ehLimitrofe(outro)) return; 
        if (qtdFronteiras < fronteiras.length) {
            fronteiras[qtdFronteiras] = outro;
            qtdFronteiras++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais p = (Pais) o;
        return codigoISO.equals(p.codigoISO);
    }

    public boolean ehLimitrofe(Pais outro) {
        for (int i = 0; i < qtdFronteiras; i++) {
            if (fronteiras[i].equals(outro)) {
                return true;
            }
        }
        return false;
    }

    public double densidade() {
        return populacao / dimensao;
    }

    public Pais[] vizinhosComuns(Pais outro) {
        int total = 0;
        for (int i = 0; i < qtdFronteiras; i++) {
            if (outro.ehLimitrofe(fronteiras[i])) {
                total++;
            }
        }
        Pais[] comuns = new Pais[total];
        int pos = 0;
        for (int i = 0; i < qtdFronteiras; i++) {
            if (outro.ehLimitrofe(fronteiras[i])) {
                comuns[pos] = fronteiras[i];
                pos++;
            }
        }
        return comuns;
    }
}