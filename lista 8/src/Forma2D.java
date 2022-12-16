public class Forma2D{
    private float x1, y1, x2, y2;

    public Forma2D(){
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public Forma2D(float x1, float y1, float x2, float y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Forma2D(Forma2D sh){
        this.x1 = sh.getX1();
        this.y1 = sh.getY1();
        this.x2 = sh.getX2();
        this.y2 = sh.getY2();
    }

    public float getX1(){
        return this.x1;
    }

    public float getX2(){
        return this.x2;
    }

    public float getY1(){
        return this.y1;
    }

    public float getY2(){
        return this.y2;
    }

    public void setX1(float x1){
        this.x1 = x1;
    }

    public void setX2(float x2){
        this.x2 = x2;
    }

    public void setY1(float y1){
        this.y1 = y1;
    }

    public void setY2(float y2){
        this.y2 = y2;
    }

    public float calculaDistancia(float x1, float y1, float x2, float y2){
        double c = ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        return (float)Math.sqrt(c);
    }

    @Override
    public String toString(){
        return "X1 = " + x1 + "\nY1 = " + y1 + "\nX2 = " + x2 + "\nY2 = " + y2 + "\n";
    }

    public float calculaArea(){
        return calculaDistancia(x1, y1, x2, y2);
    }

    public float calculaPerimetro(){
        return calculaDistancia(x1, y1, x2, y2);
    }
}