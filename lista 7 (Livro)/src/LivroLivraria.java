public class LivroLivraria extends Livro{
    private float preco;
    private int estoque;

    public LivroLivraria(String titulo, String autor, int numPaginas, int anoPub, float preco, int estoque){
        super(titulo, autor, numPaginas, anoPub);
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean isAvailable(){
        if (estoque>0){
            return true;
        }else return false;
    }

    public void sell(){
        setEstoque(getEstoque()-1);
    }

    public String toString(){
        return super.toString()+"\npreco: "+getPreco()+"\nestoque: "+getEstoque();
    }

    /**
     * @return float return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return int return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}
