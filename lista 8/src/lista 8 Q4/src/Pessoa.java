public class Pessoa{
    private String nome;
    private long cpf;
    private Data aniversario;
    private String endereco;
    private int telefone;
    private String email;

    public Pessoa(){
    }

    public Pessoa(String nome, long cpf, Data aniversario, String endereco, int telefone, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.aniversario = aniversario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        if(!verificaDados()){
            System.out.println("Erro dados invalidos!!");
        }
    }

    public String getNome(){
        return nome;
    }

    public long getId(){
        return cpf;
    }

    public Data getaniversario(){
        return aniversario;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setId(long i){
        cpf = i;
    }

    public void setDate(Data d){
        aniversario = d;
    }

    private boolean verificaDados(){
        if(nome == null){
            return false;
        }
        if(cpf < 999){
            return false;
        }
        return true;
    }

    

    @Override
    public String toString(){
        return "Nome: " + nome + "\nID: " + cpf + "\nData de aniversario: " + aniversario.toString() + "\n";
    }

    /**
     * @return long return the cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return int return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}