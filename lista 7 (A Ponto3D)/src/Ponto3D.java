public class Ponto3D{
    private Ponto2D XeY;
    private int z;

    public Ponto3D(int x, int y, int z){
        XeY = new Ponto2D(x,y);
        this.z = z;
    }

    public String toString(){
        return "coordenadas do ponto 3d: " + XeY.getX() + " , " + XeY.getY() + getZ();
    }

    public boolean inAxisX(){
        if (XeY.getY()==0){
            return true;
        }else return false;
    }

    public boolean inAxisY(){
        if (XeY.getX()==0){
            return true;
        }else return false;
    }

    public boolean inAxisZ(){
        if (getZ()==0){
            return true;
        }else return false;
    }

    public boolean inAxis(){
        if(inAxisX() && inAxisY() && inAxisZ()){
            return true;
        }else return false;
    }

    public boolean inOrigin(){
        if(inAxisX() && inAxisY() && inAxisZ()){
            return true;
        }else return false;
    }

    public float distancia(){
        return (float)Math.sqrt(((double)0 - XeY.getX())*((double)0 - XeY.getX())+((double)0 - XeY.getY())*((double)0 - XeY.getY())+((double)z-getZ())*((double)z-getZ()));
    }

    public float distancia(float x, float y,float z){
        return (float)Math.sqrt(((double)x - XeY.getX())*((double)x - XeY.getX())+((double)y - XeY.getY())*((double)y - XeY.getY())+((double)z-getZ())*((double)z-getZ()));
    }

    public static float distancia(Ponto3D ponto1, Ponto3D ponto2){
        return (float)Math.sqrt(((double)ponto1.XeY.getX() - ponto2.XeY.getX())*((double)ponto1.XeY.getX() - ponto2.XeY.getX())+((double)ponto1.XeY.getY() - ponto2.XeY.getY())*((double)ponto1.XeY.getY() - ponto2.XeY.getY())+((double)ponto1.getZ()-ponto2.getZ())*((double)ponto1.getZ()-ponto2.getZ()));
    }

    public static float distancia(Ponto3D P){
        return (float)Math.sqrt(((double)0 - P.XeY.getX())*((double)0 - P.XeY.getX())+((double)0 - P.XeY.getY())*((double)0 - P.XeY.getY())+((double)0-P.getZ())*((double)0-P.getZ()));
    }
    
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}