public class Circulo {
    
    private float x;
    private float y;
    private float raio;

    public Circulo(float x, float y, float raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public Circulo(){
        this.x=0;
        this.y=0;
        this.raio = 0;
    }

    //getters e setters
    public void setCircleX(float x){
        this.x=x;
    }
    public void setCircleY(float y){
        this.y=y;
    }
    public void setRaio(float raio){
        this.raio=raio;
    }
    public float getcircleX(){
        return this.x;
    }
    public float getcircleY(){
        return this.y;
    }
    public float getRaio(){
        return raio;
    }

    public boolean validaCirculo(){
        if (raio<=0){
            return false;
        }else return true;
    }

    public void imprimeCirculo(){
        System.out.printf("X: %f\tY: %f\tRaio: %f\n",getcircleX(),getcircleY(),raio);
    }

    public boolean isInnerPoint(Ponto2D otherPonto){
        Ponto2D ponto2 = new Ponto2D(this.x, this.y);
        
        if(ponto2.distancia(otherPonto)>raio){
            return false;
        }else return true;
    }

    public float area(){
        return (3.14f * (raio*raio));
    }

    public float perimetro(){
        return (2 * 3.14f * raio);
    }

    public boolean isBiggerThan(Circulo otherCirculo){
        if(area()>otherCirculo.area()){
            return true;
        }else return false;
    }


}
