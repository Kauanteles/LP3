public class Ponto2D {
    
    private int x;
    private int y;

    public void setPonto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void imprimirPonto(){
        System.out.printf("O ponto se encontra nas coordenadas: x=%d e y=%d\n",x,y);
    }

    public boolean isEixoX(){
        if (x==0){
            return true;
        }else return false;
    }

    public boolean isEixoY(){
        if (y==0){
            return true;
        }else return false;
    }

    public int quadrante(){
       if(isEixoX() || isEixoY()){
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

    public float distancia(Ponto2D ponto1){
        return (float)Math.sqrt(((double)ponto1.x - x)*((double)ponto1.x - x)+((double)ponto1.y - y)*((double)ponto1.y - y));
    }

}
