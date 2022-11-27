public class contato {

    private String nome;
    private String email;
    private int telefone;
    private Date dateNascimento;

    public contato(int telefone){
        this.nome = null;
        this.email = null;
        this.telefone = telefone;
        this.dateNascimento.setDate(1, 1, 2000);
    }

    public contato(){
    this.nome = null;
    this.email = null;
    this.telefone = 0;
    this.dateNascimento.setDate(1, 1, 2000);
    
    }
    public contato(String nome, String email, int telefone, Date dateNascimento){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dateNascimento = dateNascimento;
    }
    
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public int getTelefone(){
        return telefone;
    }
    public int getDateNascimentoDay(){
        return dateNascimento.getDay();
    }
    public int getDateNascimentoMonth(){
        return dateNascimento.getMonth();
    }
    public int getDateNascimentoYear(){
        return dateNascimento.getYear();
    }
    public void printContato(){
         System.out.printf("\tContatoinfo:\nnome: %s\nemail: %s\ntelefone: %d\ndateNascimento: %d/%d/%d",nome,email,telefone,dateNascimento.getDay(),dateNascimento.getMonth(),dateNascimento.getYear());
    }
    public int ageCalculator(Date dateNascimento, Date dateAtual){
        if(dateAtual.getYear() >= dateNascimento.getYear()){
            if(dateAtual.getMonth() >= dateNascimento.getMonth()){
                if(dateAtual.getDay() >= dateNascimento.getDay()){
                    return(dateAtual.getYear() - dateNascimento.getYear());
                }else {
                    System.out.println("Erro: data de nascimento incompativel com data atual!");
                    System.exit(-1);
                    return 0;
                }
            }else {
                System.out.println("Erro: data de nascimento incompativel com data atual!");
                System.exit(-1);
                return 0;
            }
        }else {
            System.out.println("Erro: data de nascimento incompativel com data atual!");
            System.exit(-1);
            return 0;
        }
    }
}

