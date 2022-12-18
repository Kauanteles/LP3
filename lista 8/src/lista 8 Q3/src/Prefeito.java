public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, long id, Data nascimento, String sigla, int numPartido, String cidade){
        super(nome,id,nascimento,sigla,numPartido);
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return super.toString()+"\ncidade: "+cidade;
    }
}
