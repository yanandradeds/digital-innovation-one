package pacotebanco;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
        Banco.clientesList.add(this);

    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
