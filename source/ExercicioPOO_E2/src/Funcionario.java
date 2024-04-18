/*
 * Prof. Robson Martins
 * ADS/GTI Facens
 * Exercicios POO / Exercicio 2
 */

public class Funcionario {
    protected int numeroCracha;
    protected String nome;
    protected String setor;
    protected String funcao;
    
    public Funcionario() {
        this.numeroCracha = -1;
        this.nome = "";
        this.setor = "";
        this.funcao = "";
    }
    
    public Funcionario(int numeroCracha, String nome,
                       String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
   

}
