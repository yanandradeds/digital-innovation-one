package pacotebanco;

public class Main {

    public static void main(String[] args) {

        Agencia scAgencia = new Agencia(Estados.SC);
        Agencia prAgencia = new Agencia(Estados.PR);
        Agencia rsAgencia = new Agencia(Estados.RS);
        Cliente yan = new Cliente("Yan", "48197242351");
        Cliente joao = new Cliente("Joao", "46861997112");
        Cliente maria = new Cliente("Maria", "25459456465");
        Cliente etc = new Cliente("Etc","456445645664");
        Conta etcConta = new Conta(etc,Estados.SC,TipoConta.CC);
        Conta yanConta = new Conta(yan,Estados.SC,TipoConta.CC);
        Conta joaoConta = new Conta(joao,Estados.RS,TipoConta.CC);
        Conta mariaConta = new Conta(maria,Estados.PR,TipoConta.CC);

        Banco bancoYan = new Banco();

        bancoYan.ListarAgencia();
        bancoYan.ListarCliente();

        etcConta.depositar(5550);
        yanConta.depositar(1000);
        etcConta.transferencia(500,yan);

        bancoYan.ListarCliente();

    }
}
