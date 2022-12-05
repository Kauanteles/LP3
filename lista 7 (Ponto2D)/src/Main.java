public class Main{
    public static void main(String[] args){
        Ponto2D ponto1 = new Ponto2D(0,2);
        Ponto2D ponto2 = new Ponto2D(2,0);
        System.out.println(ponto1.inAxisY());
        System.out.println(ponto2.inAxisX());
        System.out.println(ponto1.inOrigin());
        System.out.println(Ponto2D.distancia(ponto1, ponto2));
    }
}