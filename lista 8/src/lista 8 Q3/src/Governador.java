public class Governador extends Politico{
    private String estado;

    public Governador(String nome, long id, Data nascimento, String sigla, int numPartido, String estado){
        super(nome,id,nascimento,sigla,numPartido);
        this.estado = estado;
    }

    @Override
    public String toString(){
        return super.toString()+"\n estado: "+estado;
    }
}
