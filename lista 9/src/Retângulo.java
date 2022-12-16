public class Retângulo extends Forma2D{
    private float x3, y3, x4, y4;

    public Retângulo(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        if(!verificaRetangulo()){
            System.out.println("Erro, não é um retangulo!!");
            System.exit(-1);
        }
    }

    public Retângulo(){
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Retângulo(Retângulo r){
        this(r.getX1(), r.getY1(), r.getX2(), r.getY2(), r.getX3(), r.getY3(), r.getX4(), r.getY4());
    }

    public float getX3(){
        return this.x3;
    }

    public float getX4(){
        return this.x4;
    }

    public float getY3(){
        return this.y3;
    }

    public float getY4(){
        return this.y4;
    }

    public void setX3(float x3){
        if(verificaRetangulo()){
            this.x3 = x3;
        }
    }

    public void setX4(float x4){
        if(verificaRetangulo()){
            this.x4 = x4;
        }
    }

    public void setY3(float y3){
        if(verificaRetangulo()){
            this.y3 = y3;
        }
    }

    public void setY4(float y4){
        if(verificaRetangulo()){
            this.y4 = y4;
        }
    }

    private boolean verificaRetangulo(){
        float d1 = super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2());
        float d2 = super.calculaDistancia(getX3(), getY3(), getX4(), getY4());
        
        if(d1 == d2){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Retângulo\n" + super.toString() + "X3 = " + x3 + "\nY3 = " + y3 + "\nX4 = " + x4 + "\nY4 = " + y4 + "\n";
    }

    @Override
    public float calculaArea(){
        return super.calculaDistancia(getX1(), getY1(), getX2(), getY2()) * super.calculaDistancia(getX2(), getY2(), getX3(), getY3());
    }

    @Override
    public float calculaPerimetro(){
        return 2 * super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2()) + 2 * super.calculaDistancia(getX3(), getY3(), getX4(), getY4());
    }
}