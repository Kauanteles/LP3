public class Funcionario extends Pessoa{
    private Data admissao;
    private double salario;

    public Funcionario(String nome, long id, Data nascimento, Data a, double s){
        super(nome, id, nascimento);
        admissao = a;
        salario = s;
        if(!verifica()){
            System.out.println("Erro, dados invalidos!!");
            System.exit(-1);
        }
    }

    public Data getAdmissao(){
        return admissao;
    }

    public double getSalario(){
        return salario;
    }

    public void setAdmissao(Data d){
        admissao = d;
    }

    public void setSalario(double s){
        salario = s;
    }

    private boolean verifica(){
        if(salario < 0){
            return false;
        }
        return true;
    }

    public double qualSalario(){
        return salario;
    }

    @Override
    public String toString(){
        return "Funcionario\n" + super.toString() + "Data de admissão: " + admissao.toString() + "Salario: " + salario + "\n";
    }
}
