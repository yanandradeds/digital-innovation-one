package pacotebanco;

public class Conta {

    private Cliente cliente;
    private Agencia agencia;
    private String conta;
    private int saldo;
    private TipoConta tipo;

    public Conta(Cliente cliente, Estados estado, TipoConta tipo){
        this.cliente = cliente;
        this.agencia = Banco.agenciaMap.get(estado);
        this.conta = agencia.getNumeroConta();
        this.saldo = 0;
        this.tipo = tipo;
        cliente.setConta(this);
        Banco.contaList.add(this);
    }

    public void sacar(int valor) {
        saldo -= valor;
    }


    public void depositar(int valor) {
        saldo += valor;
    }

    public void transferencia(int valor, Cliente cliente) {
        this.sacar(valor);
        cliente.getConta().depositar(valor);

    }

    public Cliente getCliente() {
        return cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }
}
