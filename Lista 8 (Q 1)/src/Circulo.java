public class Circulo extends Forma2D{
    private static final float PI = 3.141592f;

    public Circulo(){
        super(0, 0, 0, 0);
    }

    public Circulo(float x1, float y1, float x2, float y2){
        super(x1, y1, x2, y2);
    }

    public Circulo(Circulo c){
        super(c.getX1(), c.getY1(), c.getX2(), c.getY2());
    }

    @Override
    public String toString(){
        return "Circulo\n" + super.toString();
    }

    @Override
    public float calculaArea(){
        return  PI * super.calculaDistancia(getX1(), getY1(), getX2(), getY2()) * super.calculaDistancia(getX1(), getY1(), getX2(), getY2());
    }

    @Override
    public float calculaPerimetro(){
        return 2 * PI * super.calculaDistancia(getX1(), getY1(), getX2(), getY2());
    }
}