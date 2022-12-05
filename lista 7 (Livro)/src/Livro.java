public class Livro {
        private String titulo;
        private String autor;
        private int numPaginas;
        private int anoPub;

        public Livro(){
            this.titulo = "a definir";
            this.autor = "a definir";
            this.numPaginas = 0;
            this.anoPub = 1900;
        }

        public Livro(String titulo, String autor, int numPaginas, int anoPub){
            this.titulo = titulo;
            this.autor = autor;
            this.numPaginas = numPaginas;
            this.anoPub = anoPub;
        }

        public String toString(){
            return "info do livro: \ntitulo: "+getTitulo()+"\nautor: "+getAutor()+"\nnumPaginas: "+getNumPaginas()+"\nano de publicação: "+getAnoPub();
        }

        public static boolean isOlder(Livro livro1, Livro livro2){
            if(livro1.getAnoPub()<livro2.getAnoPub()){
                return true;
            }else return false;
        }


    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return int return the numPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * @param numPaginas the numPaginas to set
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * @return int return the anoPub
     */
    public int getAnoPub() {
        return anoPub;
    }

    /**
     * @param anoPub the anoPub to set
     */
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

}
