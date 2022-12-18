public class Politico extends Pessoa{
    private String sigla;
    private int numPartido; 

    public Politico(){
    }

    public Politico(String nome, long id, Data nascimento, String sigla, int numPartido){
        super(nome,id,nascimento);
        this.sigla = sigla;
        this.numPartido = numPartido;
    }

    public String toString(){
        return super.toString()+"\nsigla: "+sigla+"\npartido: "+numPartido;
    }
}
