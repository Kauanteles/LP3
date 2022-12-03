public class SegmentoReta {
    private Ponto2D pontoInicial;
    private Ponto2D pontoFinal;
    private float distancia;

    public SegmentoReta(Ponto2D ponto1, Ponto2D ponto2){
        pontoInicial = ponto1;
        pontoFinal = ponto2;
        distancia = calculaDimensao();
    }

    public String imprimeSegmentoReta(){
        return "ponto1: "+pontoInicial.getX()+", "+pontoInicial.getY()+"\n"+"ponto2: "+pontoFinal.getX()+", "+pontoFinal.getY()+"\n"+"distancia: "+ this.distancia;
    }

    private float calculaDimensao(){
        return Ponto2D.distancia(pontoInicial,pontoFinal);
    }
    
    

}
