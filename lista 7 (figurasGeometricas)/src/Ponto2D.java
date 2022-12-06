public class Ponto2D {
    
    private int x;
    private int y;

    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto){
        this(ponto.getX(),ponto.getY());
    }

    public Ponto2D(){
        this(0,0);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String toString(){
        return "coordenadas do ponto: "+getX()+" , "+getY();
    }

    public boolean inAxisX(){
        if (y==0){
            return true;
        }else return false;
    }

    public boolean inAxisY(){
        if (x==0){
            return true;
        }else return false;
    }

    public boolean inAxis(){
        if(inAxisX() && inAxisY()){
            return true;
        }else return false;
    }

    public boolean inOrigin(){
        if(inAxisX() && inAxisY()){
            return true;
        }else return false;
    }

    public int quadrante(){
       if(inAxisX() || inAxisY()){
            return 0;
       }else if(x>0 && y>0){
                return 1;
             }else if(x>0 && y<0){
                      return 2;
                   }else if(x<0 && y<0){
                            return 3;
                         }else if(x<0 && y>0){
                                  return 4;
                               }else return 0;
    } 

    public static int quadrante(Ponto2D P){
        if(P.inAxisX() || P.inAxisY()){
             return 0;
        }else if(P.x>0 && P.y>0){
                 return 1;
              }else if(P.x>0 && P.y<0){
                       return 2;
                    }else if(P.x<0 && P.y<0){
                             return 3;
                          }else if(P.x<0 && P.y>0){
                                   return 4;
                                }else return 0;
     } 

    /* Comentado para dar espaço ao metodo estatico com mesma assinatura

    public float distancia(Ponto2D ponto1){
        return (float)Math.sqrt(((double)ponto1.x - x)*((double)ponto1.x - x)+((double)ponto1.y - y)*((double)ponto1.y - y));
    }
    */ 
    public float distancia(){
        return (float)Math.sqrt(((double)0 - x)*((double)0 - x)+((double)0 - y)*((double)0 - y));
    }

    public float distancia(float x, float y){
        return (float)Math.sqrt(((double)x - this.x)*((double)x - this.x)+((double)y - this.y)*((double)y - this.y));
    }

    public static float distancia(Ponto2D ponto1, Ponto2D ponto2){
        return (float)Math.sqrt(((double)ponto1.x - ponto2.x)*((double)ponto1.x - ponto2.x)+((double)ponto1.y - ponto2.y)*((double)ponto1.y - ponto2.y));
    }

    public static float distancia(Ponto2D P){
        return (float)Math.sqrt(((double)0 - P.x)*((double)0 - P.x)+((double)0 - P.y)*((double)0 - P.y));
    }
}
