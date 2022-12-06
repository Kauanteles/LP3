public class cone extends Ponto2D{
    private Ponto2D lateralBase;
    private Ponto2D topo;
    public static float pi = 3.14f;

    public cone(Ponto2D p1, Ponto2D p2, Ponto2D p3){
        super(p1);
        lateralBase = p2;
        topo = p3;
    }

    Ponto2D base = new Ponto2D(super.getX(),super.getY());

    public float volume(){
        return pi*(Ponto2D.distancia(base, lateralBase)*Ponto2D.distancia(base, lateralBase))*Ponto2D.distancia(base, topo);
    }

    public float area(){
        return (float) (pi*Ponto2D.distancia(base, lateralBase)*(Ponto2D.distancia(base, lateralBase)+Math.sqrt(Ponto2D.distancia(base, lateralBase)+(Ponto2D.distancia(base, topo)*Ponto2D.distancia(base, topo)))));
    }

    public String toString(){
        return "\ndados do cone: "+"\ncentro da base: "+base.toString()+"\nlateral da base: "+lateralBase.toString()+"\ntopo do cone: "+topo.toString()+"\naltura: "+Ponto2D.distancia(base, topo);
    }
}