public class Main {
    public static void main(String[] args){
        Ponto2D p1 = new Ponto2D(1,1);
        Ponto2D p2 = new Ponto2D(2,1);
        Ponto2D p3 = new Ponto2D(1,3);
        cone Cone = new cone(p1, p2, p3);
        cilindro Cilindro = new cilindro(p1, p2, p3);
        System.out.println(Cone.toString());
        System.out.println(Cone.area());
        System.out.println(Cone.volume());
        System.out.println(Cilindro.toString()); 
        System.out.println(Cilindro.area());
        System.out.println(Cilindro.volume());
    }
}
