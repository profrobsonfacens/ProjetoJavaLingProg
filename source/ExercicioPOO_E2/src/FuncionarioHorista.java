/*
 * Prof. Robson Martins
 * ADS/GTI Facens
 * Exercicios POO / Exercicio 2
 */

public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;
    
    public FuncionarioHorista() {
        super();
        this.qtdeHoras = 0;
        this.valorHora = 0.0;
    }
    
    public FuncionarioHorista(int numeroCracha, String nome, String setor,
                              String funcao, int qtdeHoras, double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }
    
    public String imprimir() {
        if (nome.isEmpty()) {
            return "Nenhum funcionario cadastrado.";
        } else {
            return String.format("Cracha: %d\n", numeroCracha) + 
                   String.format("Nome: %s\n", nome) +
                   String.format("Setor: %s\n", setor) +
                   String.format("Funcao: %s\n", funcao) +
                   String.format("Qtd Horas: %d Horas\n", qtdeHoras) +
                   String.format("Valor Hora: R$ %.2f", valorHora);
        }
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    

}
