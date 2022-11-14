public class Ponto2D {
    
    private float x;
    private float y;

    public Ponto2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    public void imprimirPonto(){
        System.out.printf("O ponto se encontra nas coordenadas: x=%f e y=%f\n",x,y);
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
