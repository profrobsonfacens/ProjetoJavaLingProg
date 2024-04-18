/*
 * Prof. Robson Martins
 * ADS/GTI Facens
 * Exercicios POO / Exercicio 2
 */

public class FuncionarioMensalista extends Funcionario {
    private double salario;
    
    public FuncionarioMensalista() {
        super();
        this.salario = 0.0;
    }
    
    public FuncionarioMensalista(int numeroCracha, String nome,
                       String setor, String funcao, double salario) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
    }
    
    public String imprimir() {
        if (nome.isEmpty()) {
            return "Nenhum funcionario cadastrado.";
        } else {
            return String.format("Cracha: %d\n", numeroCracha) + 
                   String.format("Nome: %s\n", nome) +
                   String.format("Setor: %s\n", setor) +
                   String.format("Funcao: %s\n", funcao) +
                   String.format("Salario: R$ %.2f", salario);
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   

}
