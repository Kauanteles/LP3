public class ChefeDeDepartamento extends Pessoa{
    private String departamento;
    private Data promocaoChefe;

    public ChefeDeDepartamento(String nome, long id, Data nascimento, String dp, Data pc){
        super(nome, id, nascimento);
        departamento = dp;
        promocaoChefe = pc;
        if(!verifica()){
            System.out.println("Erro, dados invalidos!!");
            System.exit(-1);
        }
    }

    public String getDepartamento(){
        return departamento;
    }

    public Data getPromocaochefe(){
        return promocaoChefe;
    }

    public void setDepatamento(String d){
        departamento = d;
    }

    public void setPromocaoChefe(Data d){
        promocaoChefe = d;
    }

    private boolean verifica(){
        if(departamento == null){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Chefe de Departamento\n" + super.toString() + "Departamento: " + departamento + "\nPromoção chefe: " + promocaoChefe.toString();
    }
}
