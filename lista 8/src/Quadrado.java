public class Quadrado extends Forma2D{
    private float x3, y3, x4, y4;

    public Quadrado(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        if(!verificaQuadrado()){
            System.out.println("Erro, não é um retangulo!!");
            System.exit(-1);
        }
    }

    public Quadrado(){
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Quadrado(Retângulo r){
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
        if(verificaQuadrado()){
            this.x3 = x3;
        }
    }

    public void setX4(float x4){
        if(verificaQuadrado()){
            this.x4 = x4;
        }
    }

    public void setY3(float y3){
        if(verificaQuadrado()){
            this.y3 = y3;
        }
    }

    public void setY4(float y4){
        if(verificaQuadrado()){
            this.y4 = y4;
        }
    }

    private boolean verificaQuadrado(){
        float d1 = super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2());
        float d2 = super.calculaDistancia(super.getX2(), super.getY2(), getX3(), getY3());
        float d3 = super.calculaDistancia(getX3(), getY3(), getX4(), getY4());
        float d4 = super.calculaDistancia(getX4(), getY4(), super.getX1(), super.getY1());

        if((d1 == d2) && (d2 == d3) && (d2 == d4)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Quadrado\n" + super.toString() + "X3 = " + x3 + "\nY3 = " + y3 + "\nX4 = " + x4 + "\nY4 = " + y4 + "\n";
    }

    @Override
    public float calculaArea(){
        float base = super.calculaDistancia(getX4(), getY4(), super.getX1(), super.getY1());
        float hip = super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2());
        float altura = (float)Math.sqrt((hip * hip) - ((base / 2) * (base / 2)));

        return base * altura / 2;
    }

    @Override
    public float calculaPerimetro(){
        return super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2()) * super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2());
    }
}