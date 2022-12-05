public class Main{
    public static void main(String[] args){
        Ponto2D ponto1XY = new Ponto2D(4,-8);
        Ponto3D ponto1 = new Ponto3D(ponto1XY,-9);
        Ponto2D ponto2XY = new Ponto2D(2,-3);
        Ponto3D ponto2 = new Ponto3D(ponto2XY,-5);
        Ponto2D ponto3XY = new Ponto2D(2,3);
        Ponto3D ponto3 = new Ponto3D(ponto3XY, 0);
        System.out.println(ponto1.inAxisY());
        System.out.println(ponto2.inAxisX());
        System.out.println(ponto3.inAxisZ());
        System.out.println(ponto1.inOrigin());
        System.out.println(Ponto3D.distancia(ponto1, ponto2));
    }
}