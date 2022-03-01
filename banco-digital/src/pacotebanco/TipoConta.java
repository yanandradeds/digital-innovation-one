package pacotebanco;

public enum TipoConta {

    CC("Conta Corrente"),
    CP("Conta Poupanca");

    String tipo;

    TipoConta(String tipo){
        this.tipo = tipo;
    }

}
