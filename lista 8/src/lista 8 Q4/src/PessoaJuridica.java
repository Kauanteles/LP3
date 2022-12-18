public class PessoaJuridica extends Pessoa{
    private long faturamento;
    private long cnpj;

    public PessoaJuridica(String nome, long cpf, Data aniversario, String endereco, int telefone, String email, long faturamento, long cnpj){
        super(nome, cpf, aniversario, endereco, telefone, email);
        this.faturamento = faturamento;
        this.cnpj = cnpj;
    }

    /**
     * @return long return the faturamento
     */
    public long getFaturamento() {
        return faturamento;
    }

    /**
     * @param faturamento the faturamento to set
     */
    public void setFaturamento(long faturamento) {
        this.faturamento = faturamento;
    }

    /**
     * @return long return the cnpj
     */
    public long getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String toString(){
        return super.toString()+"\nfaturamento: "+faturamento+"\ncnpj: "+cnpj;
    }
}