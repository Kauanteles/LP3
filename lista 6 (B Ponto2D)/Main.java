public class Main{
    public static void main(String[] args){
        Ponto2D ponto1 = new Ponto2D(1,2);
        Ponto2D ponto2 = new Ponto2D(2,2);
        SegmentoReta s = new SegmentoReta(ponto1,ponto2);

        System.out.println(s.imprimeSegmentoReta());
    }
}