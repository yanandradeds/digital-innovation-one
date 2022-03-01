package pacotebanco;

public enum Estados {

    SC("Santa Catarina"),
    RS("Rio Grande do Sul"),
    PR("Parana");

    private String descricao;

    Estados(String descricao){
        this.descricao = descricao;

    }

    String getDecricao(){
        return this.descricao;
    }

}
