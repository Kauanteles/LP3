public class cilindro {
    private Ponto2D base;
    private Ponto2D lateralBase;
    private Ponto2D topo;
    public static float pi = 3.14f;

    public cilindro(Ponto2D p1, Ponto2D p2, Ponto2D p3){
        base = p1;
        lateralBase = p2;
        topo = p3;
    }

    public float volume(){
        return (Ponto2D.distancia(base, lateralBase)*pi)*Ponto2D.distancia(base, topo);
    }

    public float area(){
        return 2*pi*Ponto2D.distancia(base, lateralBase)*Ponto2D.distancia(base, topo);
    }

    public String toString(){
        return "\ndados do cilindro: "+"\ncentro da base: "+base.toString()+"\nlateral da base: "+lateralBase.toString()+"\ntopo do cilindro: "+topo.toString()+"\naltura: "+Ponto2D.distancia(base, topo);
    }
}
