

public class Alunos {
    public String name;
    public int matricula;
    public int semestre;
    public Date dataAdmissao;
    public String tipoCurso;
    public float mensalidade;
    private static float valorBase = 700;

    public Alunos(){
    }

    public Alunos(String name, int matricula, int semestre, Date dataAdmissao, String tipoCurso, float mensalidade){
        
            this.name = name;
            this.matricula = matricula;
            this.semestre = semestre;
            this.dataAdmissao = dataAdmissao;
            this.tipoCurso = tipoCurso;
            this.mensalidade = mensalidade;
        
            
        
    }

    public String toString(){
        return "\ndados do aluno: \n"+"\nnome: "+name+"\nmatricula: "+matricula+"\ndata de admissão: "+dataAdmissao.toString()+"\ntipo do curso: "+tipoCurso+"\nmensalidade: "+mensalidade;
    }

    protected void calculaMensalidade(Date datahj) {
        switch(tipoCurso){
            case "Engenharias":
            mensalidade=valorBase+(valorBase*0.2f);
            break;
            case "Computacao":
            mensalidade=valorBase+(valorBase*0.1f);
            break;
            case "Letras":
            mensalidade=valorBase+(valorBase*0.05f);
            break;
            case "Biológicas":
            mensalidade=valorBase;
            break;
        }
        if((dataAdmissao.howManyDays(datahj)/30 != semestre)){
            mensalidade=mensalidade+(mensalidade*0.2f);
        }
    }


}
