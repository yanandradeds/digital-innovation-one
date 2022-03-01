package pacotebanco;


public class Agencia {

    private int quantidadeConta = 1;

    private String numeroAgencia;
    private Estados estado;

    public Agencia(Estados estado){
        this.numeroAgencia = String.format("%04d",Banco.quantidadeAgencia);
        Banco.quantidadeAgencia++;
        this.estado = estado;
        Banco.agenciaMap.put(estado,this);
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public Estados getEstado() {
        return estado;
    }

    public String getNumeroConta(){
        return String.format("%08d",quantidadeConta++);
    }
}
