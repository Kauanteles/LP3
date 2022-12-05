public class Ponto3D extends Ponto2D{
    private int z;

    public Ponto3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public String toString(){
        return "coordenadas do ponto 3d: " + getX() + " , " + getY() + getZ();
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
        return (float)Math.sqrt(((double)0 - getX())*((double)0 - getX())+((double)0 - getY())*((double)0 - getY())+((double)z-getZ())*((double)z-getZ()));
    }

    public float distancia(float x, float y,float z){
        return (float)Math.sqrt(((double)x - getX())*((double)x - getX())+((double)y - getY())*((double)y - getY())+((double)z-getZ())*((double)z-getZ()));
    }

    public static float distancia(Ponto3D ponto1, Ponto3D ponto2){
        return (float)Math.sqrt(((double)ponto1.getX() - ponto2.getX())*((double)ponto1.getX() - ponto2.getX())+((double)ponto1.getY() - ponto2.getY())*((double)ponto1.getY() - ponto2.getY())+((double)ponto1.getZ()-ponto2.getZ())*((double)ponto1.getZ()-ponto2.getZ()));
    }

    public static float distancia(Ponto3D P){
        return (float)Math.sqrt(((double)0 - P.getX())*((double)0 - P.getX())+((double)0 - P.getY())*((double)0 - P.getY())+((double)0-P.getZ())*((double)0-P.getZ()));
    }
    
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}