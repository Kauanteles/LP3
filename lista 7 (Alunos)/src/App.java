

public class App {
    public static void main(String[] args){
        Date datahj = new Date(6,12,2022);
        Date dataAdms = new Date(6,1,2021);
        Alunos alunocic = new Alunos("kauan",40028922,3,dataAdms,"Computacao",0);

        alunocic.calculaMensalidade(datahj);
        System.out.println(alunocic.mensalidade);
    }
}
