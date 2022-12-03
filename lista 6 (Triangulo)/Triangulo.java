public class Triangulo {
    private Ponto2D a;
    private Ponto2D b;
    private Ponto2D c;

    public Triangulo(Ponto2D a, Ponto2D b, Ponto2D c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static boolean isTrianguloEquilatero(Triangulo triangulo){
        if(Ponto2D.distancia(triangulo.a, triangulo.b) == Ponto2D.distancia(triangulo.b, triangulo.c) && Ponto2D.distancia(triangulo.b, triangulo.c) == Ponto2D.distancia(triangulo.a, triangulo.c)){
            return true;
        }else return false;
    }

    public static boolean isTrianguloIsoiceles(Triangulo triangulo){
        if (Ponto2D.distancia(triangulo.a, triangulo.b) == Ponto2D.distancia(triangulo.b, triangulo.c)||Ponto2D.distancia(triangulo.a, triangulo.b) == Ponto2D.distancia(triangulo.a, triangulo.c)){
            return true;
        }else return false;
    }

    public static boolean isTrianguloRetangulo(Triangulo triangulo){

        if (Ponto2D.distancia(triangulo.a, triangulo.b)*Ponto2D.distancia(triangulo.a, triangulo.b) == (Ponto2D.distancia(triangulo.b, triangulo.c)*Ponto2D.distancia(triangulo.b, triangulo.c) + Ponto2D.distancia(triangulo.a, triangulo.c)*Ponto2D.distancia(triangulo.a, triangulo.c))){
            return true;
        }else {
            if(Ponto2D.distancia(triangulo.b, triangulo.c)*Ponto2D.distancia(triangulo.b, triangulo.c) ==  (Ponto2D.distancia(triangulo.a, triangulo.b)*Ponto2D.distancia(triangulo.a, triangulo.b) + Ponto2D.distancia(triangulo.a, triangulo.c)*Ponto2D.distancia(triangulo.a, triangulo.c))){
                return true;
            }else {
                if(Ponto2D.distancia(triangulo.a, triangulo.c)*Ponto2D.distancia(triangulo.a, triangulo.c) ==  (Ponto2D.distancia(triangulo.b, triangulo.c)*Ponto2D.distancia(triangulo.b, triangulo.c) + Ponto2D.distancia(triangulo.a, triangulo.b)*Ponto2D.distancia(triangulo.a, triangulo.b))){
                    return true;
                }else return false;
            }
        }
        
    }

    public String toString(){
        return "arestas do triangulo: "+getA().toString()+" "+getB().toString()+" "+getC().toString()+"\ndistancia entre A e B: "+Ponto2D.distancia(getA(), getB())+"\ndistancia entre B e C: "+Ponto2D.distancia(getB(), getC())+"\ndistancia entre A e C: "+Ponto2D.distancia(getA(), getC());

    }

    

    /**
     * @return Ponto2D return the a
     */
    public Ponto2D getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Ponto2D a) {
        this.a = a;
    }

    /**
     * @return Ponto2D return the b
     */
    public Ponto2D getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Ponto2D b) {
        this.b = b;
    }

    /**
     * @return Ponto2D return the c
     */
    public Ponto2D getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Ponto2D c) {
        this.c = c;
    }

}
