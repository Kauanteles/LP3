public class pós_Graduação extends Alunos{
    public String nomeOrientador;
    public String tituloProjeto;
    public Character nivel;

    public void calculaMensalidade(Date datahj){
        if(nivel=='M'){
            if (dataAdmissao.howManyDays(datahj)/30 < 24){
                mensalidade=mensalidade+mensalidade*0.2f;
            }
        }
        if(nivel=='D'){
            if(dataAdmissao.howManyDays(datahj)/30 < 48){
                mensalidade=mensalidade+mensalidade*0.2f;
            }
        }
    }

    
}