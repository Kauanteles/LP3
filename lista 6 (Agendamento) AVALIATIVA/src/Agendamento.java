public class Agendamento {
    private Date date;
    private Time time;
    private contato Contato;

    public Agendamento(int dia, int mes, int ano, int hora, int minuto, int segundo, String nome, String email, int telefone, int diaNas, int mesNas, int anoNas){
        date = new Date(dia,mes,ano);
        time = new Time(hora,minuto,segundo);
        Contato = new contato(nome,email,telefone,diaNas,mesNas,anoNas);
    }

    public String toString(){
        return "Agendamento realizado em: \n"+date.toString()+" as: "+time.toString()+"\n\nDo contato: \n"+Contato.toString()+"\n\n";
    }
}
