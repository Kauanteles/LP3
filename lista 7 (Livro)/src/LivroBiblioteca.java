public class LivroBiblioteca extends Livro{
    private boolean emprestado;
    private Date devolução;

    public LivroBiblioteca(String titulo, String autor, int numPaginas, int anoPub, boolean emprestado, Date data){
        super(titulo, autor, numPaginas, anoPub);
        this.emprestado = emprestado;
        devolução = data;
    }

    public boolean isAvailable(){
        if (emprestado){
            return false;
        }else return true;
    }

    public void borrow(){
        setEmprestado(true);
    }

    public String toString(){
        return super.toString()+"\nfoi emprestado: "+isEmprestado()+"\n"+ devolução.toString();
    }

    /**
     * @return boolean return the emprestado
     */
    public boolean isEmprestado() {
        return emprestado;
    }

    /**
     * @param emprestado the emprestado to set
     */
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    /**
     * @return Date return the devolução
     */
    public Date getDevolução() {
        return devolução;
    }

    /**
     * @param devolução the devolução to set
     */
    public void setDevolução(Date devolução) {
        this.devolução = devolução;
    }

}
