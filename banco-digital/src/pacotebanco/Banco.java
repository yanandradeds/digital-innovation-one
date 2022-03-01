package pacotebanco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Banco {

    static List<Cliente> clientesList = new ArrayList<>();
    static List<Conta> contaList = new ArrayList<>();
    static Map<Estados,Agencia> agenciaMap = new HashMap<>();

    static int quantidadeAgencia = 1;

    public void ListarAgencia(){

        System.out.println("___________________ LISTAR AGENCIA ___________________");
        for (var entry : agenciaMap.entrySet()) {
            System.out.printf("Numero agencia: %s - Estado: %s%n", entry.getValue().getNumeroAgencia(), entry.getKey().getDecricao());
        }
        System.out.println("_____________________________________________________");

    }

    public void ListarCliente(){

        System.out.println("___________________ LISTAR CLIENTE ___________________");
        for (var entry : clientesList) {
            System.out.printf("%s -----> %s%n", entry.getNome(), entry.getCpf());
            System.out.printf("Informações da conta do proprietario --> %s%n", entry.getNome());
            System.out.printf("Agencia: %s%n", entry.getConta().getAgencia().getNumeroAgencia());
            System.out.printf("Numero Conta: %s%n", entry.getConta().getNumeroConta());
            System.out.printf("Saldo: R$%.2f%n", (float) entry.getConta().getSaldo());
            System.out.printf("Tipo da Conta: %s%n", entry.getConta().getTipo());
            System.out.println();
            System.out.println();
        }
        System.out.println("_____________________________________________________");

    }




}
