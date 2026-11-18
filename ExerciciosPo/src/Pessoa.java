import java.util.Objects;

public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this(nome, null, null);
    }

    public String getNome() { return nome; }
    public Pessoa getPai() { return pai; }
    public Pessoa getMae() { return mae; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa p = (Pessoa) o;
        return nome.equals(p.nome) && Objects.equals(mae, p.mae); 
    }

    public boolean ehIrma(Pessoa outra) {
        if (this.equals(outra)) {
            return false; 
        }
        boolean mesmaMae = mae != null && mae.equals(outra.mae);
        boolean mesmoPai = pai != null && pai.equals(outra.pai);
        return mesmaMae || mesmoPai;
    }

    public boolean ehAntecessor(Pessoa possivel) {
        if (possivel == null) return false;

        if (pai != null && (pai.equals(possivel) || pai.ehAntecessor(possivel))) {
            return true;
        }
        if (mae != null && (mae.equals(possivel) || mae.ehAntecessor(possivel))) {
            return true;
        }
        return false;
    }
}