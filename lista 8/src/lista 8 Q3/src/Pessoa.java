public class Pessoa{
    private String nome;
    private long id;
    private Data nascimento;

    public Pessoa(){
    }

    public Pessoa(String nome, long id, Data nascimento){
        this.nome = nome;
        this.id = id;
        this.nascimento = nascimento;
        if(!verificaDados()){
            System.out.println("Erro dados invalidos!!");
        }
    }

    public String getNome(){
        return nome;
    }

    public long getId(){
        return id;
    }

    public Data getNascimento(){
        return nascimento;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setId(long i){
        id = i;
    }

    public void setDate(Data d){
        nascimento = d;
    }

    private boolean verificaDados(){
        if(nome == null){
            return false;
        }
        if(id < 999){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nID: " + id + "\nData de nascimento: " + nascimento.toString() + "\n";
    }
}