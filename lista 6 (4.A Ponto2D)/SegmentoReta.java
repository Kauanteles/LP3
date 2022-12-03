public class SegmentoReta {
    private Ponto2D pontoInicial;
    private Ponto2D pontoFinal;
    private float distancia;

    public SegmentoReta(int x1, int y1, int x2, int y2){
        pontoInicial = new Ponto2D(x1,y1);
        pontoFinal = new Ponto2D(x2,y2);
        distancia = calculaDimensao();
    }

    public SegmentoReta(Ponto2D p1,Ponto2D p2){
        pontoInicial = p1;
        pontoFinal = p2;
        distancia = calculaDimensao();
    }

    public String imprimeSegmentoReta(){
        return "ponto1: "+pontoInicial.getX()+", "+pontoInicial.getY()+"\n"+"ponto2: "+pontoFinal.getX()+", "+pontoFinal.getY()+"\n"+"distancia: "+ this.distancia;
    }

    private float calculaDimensao(){
        return Ponto2D.distancia(pontoInicial,pontoFinal);
    }
    
    

}
