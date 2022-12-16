public class Triângulo extends Forma2D{
    private float x3, y3;

    public Triângulo(float x1, float y1, float x2, float y2, float x3, float y3){
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        if(!verificaTriangulo()){
            System.out.println("Erro, não é um retangulo!!");
            System.exit(-1);
        }
    }

    public Triângulo(){
        this(0, 0, 0, 0, 0, 0);
    }

    public Triângulo(Retângulo r){
        this(r.getX1(), r.getY1(), r.getX2(), r.getY2(), r.getX3(), r.getY3());
    }

    public float getX3(){
        return this.x3;
    }

    public float getY3(){
        return this.y3;
    }

    public void setX3(float x3){
        if(verificaTriangulo()){
            this.x3 = x3;
        }
    }

    public void setY3(float y3){
        if(verificaTriangulo()){
            this.y3 = y3;
        }
    }

    private boolean verificaTriangulo(){
        float d1 = super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2());
        float d2 = super.calculaDistancia(super.getX1(), super.getY1(), getX3(), getY3());
        float d3 = super.calculaDistancia(getX3(), getY3(), super.getX2(), super.getY2());

        if((d1 + d2 < d3) || (d1 + d3 < d2) || (d2 + d3 < d1)){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Triângulo\n" + super.toString() + "X3 = " + x3 + "\nY3 = " + y3 + "\n";
    }

    @Override
    public float calculaPerimetro(){
        return super.calculaDistancia(super.getX1(), super.getY1(), super.getX2(), super.getY2()) + super.calculaDistancia(super.getX1(), super.getY1(), getX3(), getY3()) + super.calculaDistancia(getX3(), getY3(), super.getX2(), super.getY2());
    }
}