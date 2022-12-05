public class Main{
    public static void main(String[] args){
        Ponto3D ponto1 = new Ponto3D(4,-8,-9);
        Ponto3D ponto2 = new Ponto3D(2,-3,-5);
        Ponto3D ponto3 = new Ponto3D(2, 3, 0);
        System.out.println(ponto1.inAxisY());
        System.out.println(ponto2.inAxisX());
        System.out.println(ponto3.inAxisZ());
        System.out.println(ponto1.inOrigin());
        System.out.println(Ponto3D.distancia(ponto1, ponto2));
    }
}